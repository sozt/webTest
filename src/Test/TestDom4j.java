package Test;

//先加入dom4j.jar包 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

/**
 * @Title: TestDom4j.java
 * @Package
 * @Description: 解析xml字符串
 * @author 无处不在
 * @date 2012-11-20 下午05:14:05
 * @version V1.0
 */
public class TestDom4j {

	public void readStringXml(String xml) {
		Document doc = null;
		try {

			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			//
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的
			doc = DocumentHelper.parseText(xml); // 将字符串转为XML

			Element rootElt = doc.getRootElement(); // 获取根节点
			System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称

			Iterator iter = rootElt.elementIterator("head"); // 获取根节点下的子节点head

			// 遍历head节点
			while (iter.hasNext()) {

				Element recordEle = (Element) iter.next();
				String title = recordEle.elementTextTrim("title"); // 拿到head节点下的子节点title值
				System.out.println("title:" + title);

				Iterator iters = recordEle.elementIterator("script"); // 获取子节点head下的子节点script

				// 遍历Header节点下的Response节点
				while (iters.hasNext()) {

					Element itemEle = (Element) iters.next();

					String username = itemEle.elementTextTrim("username"); // 拿到head下的子节点script下的字节点username的值
					String password = itemEle.elementTextTrim("password");

					System.out.println("username:" + username);
					System.out.println("password:" + password);
				}
			}
			Iterator iterss = rootElt.elementIterator("body"); // /获取根节点下的子节点body
			// 遍历body节点
			while (iterss.hasNext()) {

				Element recordEless = (Element) iterss.next();
				String result = recordEless.elementTextTrim("result"); // 拿到body节点下的子节点result值
				System.out.println("result:" + result);

				Iterator itersElIterator = recordEless.elementIterator("form"); // 获取子节点body下的子节点form
				// 遍历Header节点下的Response节点
				while (itersElIterator.hasNext()) {

					Element itemEle = (Element) itersElIterator.next();

					String banlce = itemEle.elementTextTrim("banlce"); // 拿到body下的子节点form下的字节点banlce的值
					String subID = itemEle.elementTextTrim("subID");

					System.out.println("banlce:" + banlce);
					System.out.println("subID:" + subID);
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * @description 将xml字符串转换成map
	 * @param xml
	 * @return Map
	 */
	public static Map readStringXmlOut(String xml) {
		Map map = new HashMap();
		Document doc = null;
		try {
			// 将字符串转为XML
			doc = DocumentHelper.parseText(xml);
			// 获取根节点
			Element rootElt = doc.getRootElement();
			// 拿到根节点的名称
			System.out.println("根节点：" + rootElt.getName());

			// 获取根节点下的子节点head
			Iterator iter = rootElt.elementIterator("head");
			// 遍历head节点
			while (iter.hasNext()) {

				Element recordEle = (Element) iter.next();
				// 拿到head节点下的子节点title值
				String title = recordEle.elementTextTrim("title");
				System.out.println("title:" + title);
				map.put("title", title);
				// 获取子节点head下的子节点script
				Iterator iters = recordEle.elementIterator("script");
				// 遍历Header节点下的Response节点
				while (iters.hasNext()) {
					Element itemEle = (Element) iters.next();
					// 拿到head下的子节点script下的字节点username的值
					String username = itemEle.elementTextTrim("username");
					String password = itemEle.elementTextTrim("password");

					System.out.println("username:" + username);
					System.out.println("password:" + password);
					map.put("username", username);
					map.put("password", password);
				}
			}

			// 获取根节点下的子节点body
			Iterator iterss = rootElt.elementIterator("body");
			// 遍历body节点
			while (iterss.hasNext()) {
				Element recordEless = (Element) iterss.next();
				// 拿到body节点下的子节点result值
				String result = recordEless.elementTextTrim("result");
				System.out.println("result:" + result);
				// 获取子节点body下的子节点form
				Iterator itersElIterator = recordEless.elementIterator("form");
				// 遍历Header节点下的Response节点
				while (itersElIterator.hasNext()) {
					Element itemEle = (Element) itersElIterator.next();
					// 拿到body下的子节点form下的字节点banlce的值
					String banlce = itemEle.elementTextTrim("banlce");
					String subID = itemEle.elementTextTrim("subID");

					System.out.println("banlce:" + banlce);
					System.out.println("subID:" + subID);
					map.put("result", result);
					map.put("banlce", banlce);
					map.put("subID", subID);
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * // 下面是需要解析的xml字符串例子 String xmlString = "<html>" + "<head>" +
	 * "<title>dom4j解析一个例子</title>" + "<script>" +
	 * "<username>yangrong</username>" + "<password>123456</password>" +
	 * "</script>" + "</head>" + "<body>" + "<result>0</result>" + "<form>" +
	 * "<banlce>1000</banlce>" + "<subID>36242519880716</subID>" + "</form>" +
	 * "</body>" + "</html>";
	 * 
	 * 
	 * Test2 test = new Test2(); test.readStringXml(xmlString);
	 * 
	 * Map map = readStringXmlOut(xmlString); Iterator iters =
	 * map.keySet().iterator(); while (iters.hasNext()) { String key =
	 * iters.next().toString(); // 拿到键 String val = map.get(key).toString(); //
	 * 拿到值 System.out.println(key + "=" + val); } }
	 */
	public static void main(String[] args) {
		String[] files = { "D:\\jwd\\kfc.xml", "D:\\jwd\\mdl.xml" };
		Document doc = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:/kfc.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Mongo mg;
		DB db;
		DBCollection dbc = null;
		try {
			mg = new Mongo();
			db = mg.getDB("youming_dbs");
			dbc = db.getCollection("together");
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(String file : files){
			try {
				// 读取并解析XML文档
				// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
				//
				SAXReader reader = new SAXReader(); // User.hbm.xml表示你要解析的xml文档
				doc = reader.read(new File(file));
				// 下面的是通过解析xml字符串的
				// doc = DocumentHelper.parseText(xml); // 将字符串转为XML
				Element rootElt = doc.getRootElement(); // 获取根节点
				System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称

				Iterator iter = rootElt.elementIterator("POI"); // 获取根节点下的子节点head
				
				// 遍历head节点
				while (iter.hasNext()) {

					Element recordEle = (Element) iter.next();

					DBObject loc = new BasicDBObject();
					DBObject loc_type = new BasicDBObject();
					loc_type.put("type", "Point");
					ArrayList<Double> al = new ArrayList<Double>();
					double LAT = Double.parseDouble(recordEle.elementTextTrim("LAT"));
					double LNG = Double.parseDouble(recordEle.elementTextTrim("LNG"));
					al.add(LNG);
					al.add(LAT);
					loc_type.put("coordinates", al);
					loc.put("location", loc_type);

					String T_T = recordEle.elementTextTrim("T_T"); // 拿到head节点下的子节点title值
					loc.put("name", T_T);
					
					loc.put("categoryCode", 13108);
					String T_TAG = recordEle.elementTextTrim("T_TAG");
					loc.put("category", T_TAG);

					String R_B = recordEle.elementTextTrim("R_B");
					String R_A = recordEle.elementTextTrim("R_A");
					String T_ADD = recordEle.elementTextTrim("T_ADD");
					loc.put("add", R_B+R_A+T_ADD);
					
					String T_TEL = recordEle.elementTextTrim("T_TEL");
					loc.put("tel", T_TEL);
					Random random2 = new Random(10);
//					loc.put("passcode", random2.nextInt(20));
					loc.put("passcode", "1");
					loc.put("create_date", new Date());
					
					dbc.insert(loc);
					
					System.out.println();
				}
			} catch (DocumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}