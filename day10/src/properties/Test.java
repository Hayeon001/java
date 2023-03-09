package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		/*
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
		 */
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
			props.load(in);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//2초 후 재시도 무한루프
			/*
			 finally {
			try {
				in.close();
			} catch (IOException e) {
				try {
					Thread.sleep(2000);
				} catch (InterrupedException e1) {
					
					e.printStackTrace();
				}
				in.close();
			}
			 */
		}
		
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);

	}

}
