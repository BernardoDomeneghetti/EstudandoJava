package javaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LeituraDeArquivosDeTexto {
	private String stringArquivo;
	private Integer numeroCaracteres;
	private Integer numeroLinhas;
	private String caminhoFull;
	
	public LeituraDeArquivosDeTexto(String diretorio) {
		this.stringArquivo = "";
		this.numeroCaracteres = 0;
		this.numeroLinhas = 0;
		this.caminhoFull = diretorio;
		try {
			FileInputStream fis  = new FileInputStream(diretorio);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String linhaArquivo = br.readLine();
			
			if (!(linhaArquivo.isEmpty())){
				this.numeroLinhas++; 
			}
		
//			while(linhaArquivo != null || linhaArquivo != "") {  <Cometário while>
			while (stringNotNull(linhaArquivo)){
				this.stringArquivo = linhaArquivo;
				this.numeroCaracteres += linhaArquivo.length();
				this.numeroLinhas++;
				
				linhaArquivo = br.readLine();
			}			
		} catch (Exception e) {
			e.printStackTrace();			
		}		 
	}
	private boolean stringNotNull(String str) {
		//Eu sei que é ridículo, mas o comentário não queria funcionar 
		boolean a = false;
		if (str != null) {
			if (str != "") {
				a = true;
			}
		}		 
		return a;
	}
	
	public String getStringArquivo() {
		return stringArquivo;
	}

	public Integer getNumeroCaracteres() {
		return numeroCaracteres;
	}

	public Integer getNumeroLinhas() {
		return numeroLinhas;
	}

	public String getCaminhoFull() {
		return caminhoFull;
	}	

}
