package base.java_io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileEditor {
	public void writeLineInExistingFile(String fileName, String text) throws IOException {
		OutputStream fos = new FileOutputStream(fileName);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
				
		bw.write(text);
				
		bw.close();
	}
	
	public void writeNewLineInExistingFile(String fileName, String text) throws IOException {
		OutputStream fos = new FileOutputStream(fileName);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);				
		bw.newLine();
		bw.write(text);
		bw.close();			
	}
}
