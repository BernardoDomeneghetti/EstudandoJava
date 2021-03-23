package arrays_09;

public class ControleCodigoInscricao {
	private static Integer codigoAtual = 0;
	
	public static Integer GetNewCodigo() {		
		ControleCodigoInscricao.codigoAtual++;
		return ControleCodigoInscricao.codigoAtual; 
	}
}
