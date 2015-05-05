package Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mamtest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(1427896377641l)));
		System.out.println(sdf.format(new Date(1427896370839l)));
		System.out.println(sdf.format(new Date(1427863234456l)));
		System.out.println(sdf.format(new Date(1427776097845l)));
		System.out.println(new Date(1427776097845l).before(new Date(1427896377641l)));
		
		List<String> l = new ArrayList<String>();
		System.out.println(!l.isEmpty());
	}
}
