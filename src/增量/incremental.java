package 增量;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class incremental {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String lastTimeStr = "2015-05-04 17:09:00";
		long lastTime = 0l;
		try {
			lastTime = sdf.parse(lastTimeStr).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String srcFilePath = "D:\\workspace\\youmingserver\\target\\classes\\com\\gwunited\\youmingserver";
		String targetPath = "C:\\Users\\think\\Desktop\\youming\\增量\\target\\";
		
		File srcFile = new File(srcFilePath);
		System.out.println(srcFile.getPath().substring(srcFile.getPath().lastIndexOf("youmingserver")));
		System.out.println(srcFile.getPath());
		if(srcFile.isDirectory()){
			File[] files = srcFile.listFiles();
			for(File file : files){
				makeFile(file,lastTime,targetPath);
			}
		}
		
	}

	public static void makeFile(File srcFile, long lastTime,String targetPath) {
		if (srcFile.isDirectory()) {
			File[] files = srcFile.listFiles();
			for (File file : files) {
				makeFile(file, lastTime, targetPath);
			}
		} else if (srcFile.isFile()) {
			if (srcFile.lastModified() > lastTime) {
				System.out.println(srcFile.getPath().substring(
						srcFile.getPath().lastIndexOf("youmingserver")));
				Copy(srcFile, targetPath+srcFile.getPath().substring(
						srcFile.getPath().lastIndexOf("youmingserver")));
			}
		}
	}

	public static void Copy(File oldfile, String newPath) {
		try {
			int bytesum = 0;
			int byteread = 0;
			if (oldfile.exists()) {
				InputStream inStream = new FileInputStream(oldfile);
				
				if(!new File(newPath).getParentFile().exists()){
					new File(newPath).getParentFile().mkdirs();
				}
				
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[1444];
				while ((byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread;
					System.out.println(bytesum);
					fs.write(buffer, 0, byteread);
				}
				inStream.close();
			}
		} catch (Exception e) {
			System.out.println("error  ");
			e.printStackTrace();
		}
	}
}
