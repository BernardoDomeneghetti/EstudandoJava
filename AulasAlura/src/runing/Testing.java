package runing;

import java.io.IOException;

import base.java_io.FileEditor;
import config.ApplicationGUI;

public class Testing {
	public static void main(String[] args) throws IOException {
		ApplicationGUI.out(" ___________________________________________________________________");
		ApplicationGUI.out("|                                                                   |");
		ApplicationGUI.out("| IMPORTANT!!! To stop the insertion: press ENTER in an empty line! |");		
		ApplicationGUI.out("|___________________________________________________________________|");
		
		ApplicationGUI.out("Insert the text you want to grave in the text file:");
		String userEntrance = FileEditor.newFE().getUserEntranceString();
		
		ApplicationGUI.out("The file is gonna be writen with:");
		ApplicationGUI.out(userEntrance);
			
		try {
			FileEditor.newFE().writeLineInExistingFile("ArquivoDeTeste", userEntrance);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
