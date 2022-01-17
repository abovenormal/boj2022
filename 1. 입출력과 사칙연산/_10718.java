package boj2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _10718 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bf.write("강한친구 대한육군");
		bf.newLine();				// buffer 로 개행하는법.
		bf.write("강한친구 대한육군");
		bf.flush();
		bf.close();
	}
}
