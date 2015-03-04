package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class HandleCsv {
	public static void main(String[] args) throws IOException {
		StringBuffer code = new StringBuffer("");
		StringBuffer category = new StringBuffer("");
		String[] files = {
							"D:\\download\\百度地图数据poi数据\\百度地图数据poi数据\\baidupoi_113_23.csv",
							"D:\\download\\百度地图数据poi数据\\百度地图数据poi数据\\baidupoi_114_22.csv",
							"D:\\download\\百度地图数据poi数据\\百度地图数据poi数据\\baidupoi_117_39.csv"
							};
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		BufferedReader br = null;
		System.out.println("start:");
		long a = System.currentTimeMillis();
		int i = 0;
		for(String file : files){

			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			String line;
			String name;
			String CLA;
			String ADDR;
			String tel;
			double LAT;
			double LNG;
//			StringBuffer sb = null;
			try{
				Mongo mg = new Mongo();
				DB db = mg.getDB("so");
				
				DBCollection dbc = db.getCollection("mapinfo");
				
				int j = 0;
				while ((line = br.readLine()) != null) {
					System.out.println(i+"line:"+line);
					if(j==0){
						j++;
						continue;
					}
					i++;
					/*if(i>10)
						break;*/

//					System.out.println();
					
//					sb = new StringBuffer("db.mapinfo.insert({\"loc\" : { type: \"Point\", coordinates: ");
					// System.out.println(line);
					
					String[] info = line.split("\",\"");
					name = info[0].replace("\"", "").trim();
					CLA = info[1].replace("\"", "").trim();
				
					ADDR = info[2].replace("\"", "").trim();
					tel = info[4].replace("\"", "").trim();
					LNG = Double.parseDouble(info[5].replace("\"", "").trim());
					LAT = Double.parseDouble(info[6].replace("\"", "").trim());
					
					DBObject loc = new BasicDBObject();
					DBObject loc_type = new BasicDBObject();
					loc_type.put("type", "Point");
					ArrayList<Double> al = new ArrayList<Double>();
					al.add(LNG);
					al.add(LAT);
					loc_type.put("coordinates", al);
					loc.put("loc", loc_type);
					
					loc.put("name", name);
					

					String[] cats = CLA.split("],");
//					System.out.println(CLA+","+cats.length);
					
					if(cats.length>0){
						code = new StringBuffer("");
						category = new StringBuffer("");
						for(String str : cats){
							str = str.replace("[", "").replace("]", "");
//						System.out.println(str);
							String[] strs = str.split(",");
							DecimalFormat df2 = new DecimalFormat("00");
							if(strs.length>1){
								code.append(df2.format(Integer.parseInt(strs[0])));
								category.append(strs[1]);
							}
						}
//						System.out.println(code.toString());
//						System.out.println(category.toString());
					}
					loc.put("categoryCode", code.toString());
					loc.put("category", category.toString());
					List<String> list = map.get(code.toString());
					
					if(!"".equals(code.toString()) && list != null){
						list.add(category.toString());
						map.put(code.toString(), list);
					}else if(!"".equals(code.toString())){
						list = new ArrayList<String>();
						list.add(category.toString());
						map.put(code.toString(), list);
					}
					
					loc.put("add", ADDR);
					loc.put("tel", tel);
					
//					dbc.insert(loc);
					
					/*sb.append("[" + LNG + "," + LAT + "]},");
					sb.append("name :\"" + name + "\",");
					sb.append(" category:\"" + CLA + "\",");
					sb.append("add:\"" + ADDR + "\",");
					sb.append("tel :\"" + tel + "\"})\r\n");
					fw.write(sb.toString());*/
					
//					System.out.println("name:"+name + ",cla:" + CLA + ",addr:" + ADDR + ",tel:"+tel+",lat:"+LAT+",lng:"+LNG);
				}
//				fw.flush();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println(i+",end:"+(System.currentTimeMillis()-a));
		
		FileWriter fw = new FileWriter("D:/category.txt");
		Set<String> set = map.keySet();
		for(String str : set){
			List<String> list = map.get(str);
			fw.write("code:"+str+",name:"+list.get(0)+",count:"+list.size()+"\n");
		}
		fw.close();
		
	}
	public static void parsingCat(String cat){}
}