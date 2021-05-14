package javaIO;

public class EasierIO {
	
	private static LeituraDeArquivosDeTexto lat;
	
	private static LeituraDeArquivosDeTexto getArquivoLido() throws EasierIONullFileNameException {
		return getArquivoLido("");
	}
	
	private static LeituraDeArquivosDeTexto getArquivoLido(String arquivo) throws EasierIONullFileNameException {		
		if (lat == null) {
			if (arquivo.isEmpty()) {
				throw new EasierIONullFileNameException(
						"Nomer do arquivo não preenchido no Easier IO");
			}
			lat = new LeituraDeArquivosDeTexto(arquivo);
		}
		return lat;
	}
	
	public static String getTextoArquivoLido() throws EasierIONullFileNameException{
		return getTextoArquivoLido("");
	}
	
	public static String getTextoArquivoLido(String arquivo) throws EasierIONullFileNameException{
		return getArquivoLido(arquivo).getStringArquivo();
	}
	
	public static Integer getNumeroLinhasArquivoLido() throws EasierIONullFileNameException{
		return getNumeroLinhasArquivoLido("");
	}
	
	public static Integer getNumeroLinhasArquivoLido(String arquivo) throws EasierIONullFileNameException{
		return getArquivoLido(arquivo).getNumeroLinhas();
	}
	
	public static Integer getNumeroCaracteresArquivoLido() throws EasierIONullFileNameException{
		return getNumeroCaracteresArquivoLido("");
	}
	
	public static Integer getNumeroCaracteresArquivoLido(String arquivo) throws EasierIONullFileNameException{
		return getArquivoLido(arquivo).getNumeroCaracteres();
	}
}
