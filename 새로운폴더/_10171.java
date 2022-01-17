package boj2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _10171 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bf.write("\\    /\\");
		bf.newLine();				
		bf.write(" )  ( ')");
		bf.newLine();
		bf.write("(  /  )");
		bf.newLine();
		bf.write(" \\(__)|");
		bf.newLine();
		
		
		bf.flush();		// 항상비워주는거 잊지 말것
		bf.close();
	}
}

