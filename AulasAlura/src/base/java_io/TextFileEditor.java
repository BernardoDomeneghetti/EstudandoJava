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

public class TextFileEditor {
	
	public static TextFileEditor newFE() {
		return new TextFileEditor();
	}
	
	public String getConsoleEntranceString() throws IOException {
		InputStream is = System.in;		
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
				
		String userEntrance = br.readLine();		
		String resultText = "";
		
		while (userEntrance != null && !userEntrance.isEmpty()) {
			resultText = resultText + "\n" + userEntrance;			
			userEntrance = br.readLine();
		}
		br.close();
		return resultText;		
	}
	
	public String getFileEntranceString(String fileAddress) throws IOException {	
		InputStream is = new FileInputStream(fileAddress);		
		Reader r = new InputStreamReader(is);
		try (BufferedReader br = new BufferedReader(r)) {
			String fileEntrance = br.readLine();		
			String resultText = fileEntrance;
			
			while (fileEntrance != null && !fileEntrance.isEmpty()) {
				fileEntrance = br.readLine();
				resultText = fileEntrance;
			}		
			return resultText;
		}		
	}
	
	public void writeLineInExistingFile(String fileName, String text) throws IOException {
		OutputStream fos = new FileOutputStream(fileName);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
				
		bw.write(text);
				
		bw.close();
	}

	

}
