package Test;

import ch.hsr.geohash.BoundingBox;
import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;

public class GeoHashTest {
	public static void main(String[] args) {
		int wei = 8;
		GeoHash gh  = GeoHash.withCharacterPrecision(39.95874,116.4579,5118);
		System.out.println("toBase32:"+gh.toBase32());
		GeoHash gh1 = GeoHash.withCharacterPrecision(39.9477492118,116.4644635303,8);
		System.out.println("toBase32:"+gh1.toBase32());
		GeoHash gh2 = GeoHash.withCharacterPrecision(39.94817,116.46430,wei);
		System.out.println("toBase32:"+gh2.toBase32());
		GeoHash gh3 = GeoHash.withCharacterPrecision(40.3,116.4,3);
		System.out.println("toBase32:"+gh3.toBase32());
		BoundingBox bb = gh.getBoundingBox();
		WGS84Point wp2 = gh.getBoundingBoxCenterPoint();
		System.out.println("center point"+wp2.getLatitude()+","+wp2.getLongitude());
//		System.out.println(bb.getMaxLat());
//		System.out.println(bb.getLatitudeSize()+","+bb.getLongitudeSize());
		
//		System.out.println("point:"+gh.getPoint().getLatitude()+","+gh.getPoint().getLongitude());
		
		gh.getEasternNeighbour();
		
		System.out.println("toString:"+gh.toString());
		System.out.println("toBinaryString:"+gh.toBinaryString());
		System.out.println("toBase32:"+gh.toBase32());
		GeoHash[] ghs = gh.getAdjacent();
		System.out.println(ghs.length);
		WGS84Point wp = null;
		
		for(GeoHash gh33 : ghs){
			wp = gh33.getBoundingBoxCenterPoint();
			System.out.println(gh33.toBase32()+"<"+wp.getLatitude()+","+wp.getLongitude());
		}
	}
}
