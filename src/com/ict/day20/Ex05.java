package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

// FileIntputString => 1byte , read()=> 아스키코드, read(숫자 , 대/소문자 ) ,byte[] b) => String 이용
// FileReader       => 2byte , read()=> 유니코드(숫자) (전세계문자표현가능), read(char[]c) => String 이용
public class Ex05 {
	public static void main(String[] args) {
		String pathname = "D:/choihyeonmin/util/test05.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

			// 한글자 읽기 (숫자 = 형변환)
//			int k = 0;
//			System.out.println(k+" : " (char) (k));

			// 전체 읽기
//			int k = 0;
//			while ((k=fr.read()) !=-1){
//			System.out.println(k+" : " (char) (k));
//		    }

			// 배열 처리
			char[] c = new char[(int) (file.length())];
			fr.read(c);
//			for (char k : c) {
//				System.out.println(k + ":" + (char) (k));
//			}
			// trim(); 앞 뒤 공백 삭제
			String msg = new String (c).trim();
			System.out.println(msg);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
