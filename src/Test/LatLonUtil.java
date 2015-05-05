package Test;

import java.util.ArrayList;
import java.util.List;

public class LatLonUtil {

	private static final double PI = 3.14159265;
	private static final double EARTH_RADIUS = 6378137;
	private static final double RAD = Math.PI / 180.0;

	// @see
	// http://snipperize.todayclose.com/snippet/php/SQL-Query-to-Find-All-Retailers-Within-a-Given-Radius-of-a-Latitude-and-Longitude--65095/
	// The circumference of the earth is 24,901 miles.
	// 24,901/360 = 69.17 miles / degree
	/**
	 * @param raidus
	 *            单位米 return minLat,minLng,maxLat,maxLng
	 */
	public static double[] getAround(double lat, double lon, int raidus) {

		Double latitude = lat;
		Double longitude = lon;

		Double degree = (24901 * 1609) / 360.0;
		double raidusMile = raidus;

		Double dpmLat = 1 / degree;
		Double radiusLat = dpmLat * raidusMile;
		Double minLat = latitude - radiusLat;
		Double maxLat = latitude + radiusLat;

		Double mpdLng = degree * Math.cos(latitude * (PI / 180));
		Double dpmLng = 1 / mpdLng;
		Double radiusLng = dpmLng * raidusMile;
		Double minLng = longitude - radiusLng;
		Double maxLng = longitude + radiusLng;
		// System.out.println("["+minLat+","+minLng+","+maxLat+","+maxLng+"]");
		return new double[] { minLat, minLng, maxLat, maxLng, maxLat - minLat,
				maxLng - minLng };
	}

	/**
	 * @param raidus
	 *            单位米 return minLat,minLng,maxLat,maxLng
	 */
	public static List<Double[]> getPointS(double lat, double lon, int raidus,
			int poCount) {
		List<Double[]> points = new ArrayList<Double[]>();
		List<Double> lats = new ArrayList<Double>();
		List<Double> lons = new ArrayList<Double>();
		
		Double latitude = lat;
		Double longitude = lon;

		Double degree = (24901 * 1609) / 360.0;
		double raidusMile = raidus;

		Double dpmLat = 1 / degree;
		Double radiusLat = dpmLat * raidusMile;
		Double minLat = latitude - radiusLat;
		Double maxLat = latitude + radiusLat;

		Double mpdLng = degree * Math.cos(latitude * (PI / 180));
		Double dpmLng = 1 / mpdLng;
		Double radiusLng = dpmLng * raidusMile;
		Double minLng = longitude - radiusLng;
		Double maxLng = longitude + radiusLng;
		// System.out.println("["+minLat+","+minLng+","+maxLat+","+maxLng+"]");

		double latMei = (maxLat - minLat) / 80;
		double lonMei = (minLng - maxLng) / 80;
		for (double y = minLat; y < maxLat; y += latMei) {
			for (double x = maxLng; x < minLng; x += lonMei) {
				points.add(new Double[]{y,x});
			}
		}

		System.out.println(latMei + "," + lonMei);
		System.out.println(lats.size()+","+lons.size());

		return points;
	}

	/**
	 * 根据两点间经纬度坐标（double值），计算两点间距离，单位为�?
	 * 
	 * @param lng1
	 * @param lat1
	 * @param lng2
	 * @param lat2
	 * @return
	 */
	public static double getDistance(double lat1, double lng1, double lat2,
			double lng2) {
		double radLat1 = lat1 * RAD;
		double radLat2 = lat2 * RAD;
		double a = radLat1 - radLat2;
		double b = (lng1 - lng2) * RAD;
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000) / 10000;
		return s;
	}

	public static double getDistance2(double lng1, double lat1, double lng2,
			double lat2) {
		double radLat1 = lat1 * RAD;
		double radLat2 = lat2 * RAD;
		double a = radLat1 - radLat2;
		double b = (lng1 - lng2) * RAD;
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000) / 10000;
		return s;
	}

	public static void main(String[] args) {
		Double lat1 = 34.264648;
		Double lon1 = 108.952736;

		int radius = 2000;
		// [34.25566276027792,108.94186385411045,34.27363323972208,108.96360814588955]
		double[] ds = getAround(116.4644905303, 39.9469472118, radius);
		for (double d : ds) {
			System.out.println(d);
		}
		List<Double[]> pointS = getPointS(116.4644905303, 39.9469472118,
				radius, 6000);
		System.out.println("ppsize:" + pointS.size());

		// 911717.0 34.264648,108.952736,39.904549,116.407288
//		38.3976280000,110.8531650000
//		38.3917129571,110.8466646952
		double dis = getDistance2(116.459, 39.94571, 116.45925899414061, 39.945635330078119);
		System.out.println("1:" + dis);
	}
}