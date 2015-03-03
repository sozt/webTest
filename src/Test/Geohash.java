package Test;

import java.io.File;  
import java.io.FileInputStream;  
import java.util.BitSet;  
import java.util.HashMap;  
  
  
public class Geohash {  
  
    private static int numbits = 6 * 5;  
    final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8',  
            '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p',  
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };  
      
    final static HashMap<Character, Integer> lookup = new HashMap<Character, Integer>();  
    static {  
        int i = 0;  
        for (char c : digits)  
            lookup.put(c, i++);  
    }  
  
    public static void main(String[] args)  throws Exception{  
    	Geohash gh = new Geohash();
    	
//        String code = gh.encode(39.9483502117,116.4629815303);
//        System.out.println(code+":\n39.9537430000,116.4708980000");
    	
        System.out.println(gh.encode(39.9483502117,116.4629815303));  
        System.out.println(gh.encode(39.9485232118,116.4636645303));  
        System.out.println(gh.encode(39.9488902117,116.4631255303));  
        System.out.println(gh.encode(39.9488972118,116.4629815303));  
        System.out.println(gh.encode(39.9493982006,116.4636017545));  
        System.out.println(gh.encode(39.9492842117,116.4636285303));  
        System.out.println(gh.encode(39.9492912118,116.4632595303));  
        System.out.println(gh.encode(39.9491112118,116.4631795303));  
        System.out.println(gh.encode(39.9492492118,116.4630085303));  
System.out.println();
        
        System.out.println(gh.encode(39.9473132118,116.4675985303));  
        System.out.println(gh.encode(39.9508502006,116.4672667545));  
        System.out.println(gh.encode(39.9489242117,116.4682455303));  
        
        System.out.println(gh.encode(39.9493042117,116.4619485303));  
        
//        double[] ds = gh.decode(code);
//        System.out.println(ds[0]+","+ds[1]);  
              
    }  

    public double[] decode(String geohash) {  
        StringBuilder buffer = new StringBuilder();  
        for (char c : geohash.toCharArray()) {  
  
            int i = lookup.get(c) + 32;  
            buffer.append( Integer.toString(i, 2).substring(1) );  
        }  
          
        BitSet lonset = new BitSet();  
        BitSet latset = new BitSet();  
          
        //even bits  
        int j =0;  
        for (int i=0; i< numbits*2;i+=2) {  
            boolean isSet = false;  
            if ( i < buffer.length() )  
              isSet = buffer.charAt(i) == '1';  
            lonset.set(j++, isSet);  
        }  
          
        //odd bits  
        j=0;  
        for (int i=1; i< numbits*2;i+=2) {  
            boolean isSet = false;  
            if ( i < buffer.length() )  
              isSet = buffer.charAt(i) == '1';  
            latset.set(j++, isSet);  
        }  
          
        double lon = decode(lonset, -180, 180);  
        double lat = decode(latset, -90, 90);  
          
        return new double[] {lat, lon};       
    }  
      
    private double decode(BitSet bs, double floor, double ceiling) {  
        double mid = 0;  
        for (int i=0; i<bs.length(); i++) {  
            mid = (floor + ceiling) / 2;  
            if (bs.get(i))  
                floor = mid;  
            else  
                ceiling = mid;  
        }  
        return mid;  
    }  
      
      
    public String encode(double lat, double lon) {  
        BitSet latbits = getBits(lat, -90, 90);  
        BitSet lonbits = getBits(lon, -180, 180);  
        StringBuilder buffer = new StringBuilder();  
        for (int i = 0; i < numbits; i++) {  
            buffer.append( (lonbits.get(i))?'1':'0');  
            buffer.append( (latbits.get(i))?'1':'0');  
        }  
//        System.out.println(buffer.toString().length()+","+buffer.toString()+";;;"+Long.parseLong(buffer.toString(), 2));
        return base32(Long.parseLong(buffer.toString(), 2));  
    }  
  
    private BitSet getBits(double lat, double floor, double ceiling) {  
        BitSet buffer = new BitSet(numbits);  
        for (int i = 0; i < numbits; i++) {  
            double mid = (floor + ceiling) / 2;  
            if (lat >= mid) {  
                buffer.set(i);  
                floor = mid;  
            } else {  
                ceiling = mid;  
            }  
        }  
        return buffer;  
    }  
  
    public static String base32(long i) {  
        char[] buf = new char[65];  
        int charPos = 64;  
        boolean negative = (i < 0);  
        if (!negative)  
            i = -i;  
        while (i <= -32) {  
            buf[charPos--] = digits[(int) (-(i % 32))];  
            i /= 32;  
        }  
        buf[charPos] = digits[(int) (-i)];  
  
        if (negative)  
            buf[--charPos] = '-';  
        return new String(buf, charPos, (65 - charPos));  
    }  
  
}