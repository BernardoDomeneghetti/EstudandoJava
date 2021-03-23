package base;

import arrays_09.ControleCodigoInscricao;
import arrays_09.ListaCompetidores;

public class Teste {
	public static void main(String[] args) {
//		ArraysContas arrCs = new ArraysContas();
//		arrCs.AddContaCorrente(new ContaCorrente(1000, "Bernardo", 1, 1000));
//		arrCs.printaContas();
//		
//		
//		ListasContas lstCs = new ListasContas();
//		lstCs.add(new ContaCorrente(1000, "Bernardo", 1, 1000));
//		lstCs.add(new ContaCorrente(1000, "Eduarda", 1, 1000));
//		
//		System.out.println(lstCs.toString());

		try {
			ListaCompetidores.iniciarInscricao();
			ListaCompetidores.inscreverCompetidor(
				new Competidor(
					ControleCodigoInscricao.GetNewCodigo(),
					"Bernardo",
					21
				)
			);
			ListaCompetidores.inscreverCompetidor(	
				new Competidor(
					ControleCodigoInscricao.GetNewCodigo(),
					"Breno",
					20
				)
			);
			ListaCompetidores.listarInscricaoCompetidores();
			ListaCompetidores.competir();
			ListaCompetidores.listarResultados();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
