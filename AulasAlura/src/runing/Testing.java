package runing;

import java.io.IOException;

import base.java_io.FileEditor;

public class Testing {
	public static void main(String[] args) {
		FileEditor fe = new FileEditor();		
			try {
				fe.writeLineInExistingFile("ArquivoDeTeste", "Testando escrita em arquivo de texto");
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
