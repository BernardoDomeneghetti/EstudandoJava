package config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Definitions {
	public static String dateFormatter(LocalDateTime date) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("YYYY/MM/DD HH24:mm:ss"); 		
		return dft.format(date);
	}

}
