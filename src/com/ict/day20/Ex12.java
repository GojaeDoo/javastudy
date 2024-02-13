package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL (Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소 
// URL 클래스 : 원격 해당위치의 자원의 결과만 가져온다.
//            final 클래스이다. 상속 안됨

public class Ex12{
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내 컴퓨터에 저장
//		String pathname = "D:/choihyeonmin/util/webPage01.txt";
//		File file = new File(pathname);
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://comic.naver.com/index");	
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine())!=null) {
				System.out.println(msg+"\n");
			}
		} catch (Exception e) {
		}finally {
			try {
				//bw.close();
				//fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
