package in.co.IOStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritebyPrintWriter {
	public static void main(String[] args) throws IOException {
		FileWriter write = new FileWriter("D:/Print.txt");
		PrintWriter o = new PrintWriter(write);
		for (int i = 0; i < 5; i++) {
			o.println(i + " : line");
		}
		o.close();
		write.close();
		
		System.out.println("Check file");
	}
}
