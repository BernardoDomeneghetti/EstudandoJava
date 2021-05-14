package base.java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileEditor {
	
	public static FileEditor newFE() {
		return new FileEditor();
	}
	
	public String getUserEntranceString() throws IOException {
		InputStream is = System.in;		
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
				
		String userEntrance = br.readLine();		
		String resultText = userEntrance;
		
		while (userEntrance != null && !userEntrance.isEmpty()) {
			userEntrance = br.readLine();
			resultText = userEntrance;
		}
		
		return resultText;
		
	}
	
	public String getFileEntranceString(String fileAddress) throws IOException {
		InputStream is = new FileInputStream(fileAddress);		
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
				
		String userEntrance = br.readLine();		
		String resultText = userEntrance;
		
		while (userEntrance != null && !userEntrance.isEmpty()) {
			userEntrance = br.readLine();
			resultText = userEntrance;
		}		
		return resultText;		
	}
	
	public void writeLineInExistingFile(String fileName, String text) throws IOException {
		OutputStream fos = new FileOutputStream(fileName);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
				
		bw.write(text);
				
		bw.close();
	}
	
	public void writeTextInExistingFile(String fileName, String text) throws IOException {
		OutputStream fos = new FileOutputStream(fileName);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
				
//		while ()				
//		bw.write(text);
//				
//		bw.close();
	}
	

}
