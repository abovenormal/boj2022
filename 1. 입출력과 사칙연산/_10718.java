package boj2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _10718 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bf.write("����ģ�� ��������");
		bf.newLine();				// buffer �� �����ϴ¹�.
		bf.write("����ģ�� ��������");
		bf.flush();
		bf.close();
	}
}
