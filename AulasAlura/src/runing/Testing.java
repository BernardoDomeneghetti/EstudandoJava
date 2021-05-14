package runing;

import java.io.IOException;
import java.io.InputStream;

import base.java_io.FileEditor;

public class Testing {
	public static void main(String[] args) throws IOException {
		System.out.println("Insert the text you want to grave in the text file");
		String teste = FileEditor.newFE().getUserEntranceString();
			
		FileEditor fe = new FileEditor();		
			try {
				fe.writeLineInExistingFile("ArquivoDeTeste", teste);
				
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
}
