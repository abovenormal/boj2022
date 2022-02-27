package boj2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _2557 {	//bufferedWriter을 이용한 빠른 출력
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		bw.flush();
		bw.close();
	}	
}
