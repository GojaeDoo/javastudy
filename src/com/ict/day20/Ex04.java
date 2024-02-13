package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter : newLine() (줄 바꿈)
public class Ex04 {
	public static void main(String[] args) {
		String pathname = "D:/c/util/test06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// String str = "안녕하세요\n123456\nHello\n"
			
			bw.write("안녕하세요");
			bw.newLine();
			bw.write(12345);
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.write("大漢");
			bw.newLine();
			
			String str = "안녕하세요\n123456\nHello\n";
			fw.write(str);
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
