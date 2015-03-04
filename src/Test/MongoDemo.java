package Test;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class MongoDemo {

	Mongo mg = null;
	
	public static void main(String[] args) {
		new MongoDemo().findMapInfo();
	}
	@Test
	public void find() {
		try {
			Mongo mg = new Mongo("10.10.10.254");
			// 查询所有的Database
			/*for (String name : mg.getDatabaseNames()) {
				System.out.println("dbName: " + name);
			}*/

			long a = System.currentTimeMillis();
			DB db = mg.getDB("admin");
			// 查询所有的聚集集合
			/*for (String name : db.getCollectionNames()) {
				System.out.println("collectionName: " + name);
			}*/

			db.authenticate("youming", "youming!234".toCharArray());
			DBCollection users = db.getCollection("user");
			// 查询所有的数据
			DBCursor cur = users.find();
			while (cur.hasNext()) {
				cur.next();
			}
			System.out.println("end:"+(System.currentTimeMillis()-a));
			System.out.println(cur.count());
			/*System.out.println(cur.getCursorId());
			System.out.println(JSON.serialize(cur));*/
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void findMapInfo() {
		try {
			mg = new Mongo();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<1;i++){
			new Thread(){
				public void run(){
					int hashCode = this.hashCode();
					long a = System.currentTimeMillis();
					System.out.println(hashCode+";start:"+a);
					DB db = mg.getDB("so");
					db.requestStart();
					DBCollection users = db.getCollection("mapinfo");
					
					DBObject db4 = new BasicDBObject();
					db4.put("type", "Point");
					ArrayList<Double> list = new ArrayList<Double>();
					double lng = 117.072025788566;
					double lat = 39.3836639633075;
					list.add(lng);
					list.add(lat);
					db4.put("coordinates", list);

					DBObject db3 = new BasicDBObject();
					db3.put("$geometry", db4);
					db3.put("$maxDistance", 200);

					DBObject db2 = new BasicDBObject();
					db2.put("$near", db3);
					

					DBObject db1 = new BasicDBObject();
					db1.put("loc", db2);
//						db1.put("categoryCode", "23228");
					
					// 查询所有的数据
					DBCursor cur = users.find(db1);
//						System.out.println(hashCode+";selectEnd:"+(System.currentTimeMillis()-a));
					int i = 1;
					while (cur.hasNext()) {
						DBObject dbo = cur.next();
						String str = dbo.toString();
						str = str.substring(str.indexOf("[")+1, str.lastIndexOf("]"));
						String[] ss = str.split(",");
//						System.out.println(i+","+str);
						System.out.println(LatLonUtil.getDistance2(lng, lat, Double.parseDouble(ss[0]), Double.parseDouble(ss[1])));
						i++;
					}
					System.out.println(hashCode+";end:"+(System.currentTimeMillis()-a));
					System.out.println(cur.count());
					System.out.println(hashCode+";other:"+(System.currentTimeMillis()-a));
					
					db.requestDone();
				}
			}.start();
		}
	}
	@Test
	public void add(){
		try{
			Mongo mg = new Mongo();
			DB db = mg.getDB("so");
			
			DBCollection dbc = db.getCollection("mapinfo");
			
			System.out.println("start:");
			long a = System.currentTimeMillis();
			for(int i =0;i<1000000;i++){
				DBObject user = new BasicDBObject();
				user.put("uid", i);
				user.put("username", "ss");
				user.put("age", "10");
				user.put("age1", "10");
				dbc.insert(user);
//				System.out.println();
			}
			System.out.println("end:"+(System.currentTimeMillis()-a));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void del(){
		try {
			Mongo mg = new Mongo();
			DB db = mg.getDB("damin");
			DBCollection dbc = db.getCollection("user");
			
			System.out.println(dbc.remove(new BasicDBObject("age",new BasicDBObject("$gte",40))).getN());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
