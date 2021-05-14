package arrays_09;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import base.Competidor;

public class ListaCompetidores {
	
	private static ArrayList<Competidor> listaCompetidores;
	
	public static void competir() throws Exception {
		if (listaCompetidores == null 
				|| listaCompetidores.size() < 1) 
		{
			throw 
				new Exception("Não existem competidores inscritos na lista");
		}
		
		System.out.print("Competindo");
		for (Integer i = 0 ; i <= 2; i ++) {
			Thread.sleep(1000);
			System.out.print(".");
		}
		
		System.out.println();
		
		for (Competidor comp:listaCompetidores) {
			comp.setPontuacao(new Random().nextInt());
		}
		
		System.out.println("Ufa... competidores cansados! Competição finalizada!");
	}
	
	public static void listarInscricaoCompetidores() {
		
		TesteComparator tc = new TesteComparator();		
		Collections.sort(listaCompetidores, tc);
		
		//é importante notar que nessa implementação foi criado um objeto da classe TesteComparator
		//essa é uma classe específica criada apenas encapsular um método, APENAS UM MÉTODO
		//e esse método é utilizado apenas uma vez
		//para optimizar isso temos duas opções
		//classes anônimas ou lambda 
		
		System.out.println("Listagem de inscrições: ");
		
		for (Competidor competidor: listaCompetidores) {	
			System.out
				.printf(
					"Id:%d Nome: %s Idade: %d Pontuacao %d \n",
					competidor.getCodigoInscricao(),
					competidor.getNome(),
					competidor.getIdade(),
					competidor.getPontuacao()						
				);
		}
		
	}
	
	public static void listarResultados() {
		Collections.sort(listaCompetidores);
		
		for (Competidor competidor: listaCompetidores) {
			System.out
				.printf(
					"Id:%d Nome: %s Idade: %d Pontuacao %d \n",
					competidor.getCodigoInscricao(),
					competidor.getNome(),
					competidor.getIdade(),
					competidor.getPontuacao()						
				);
		}
	}
	
	public static void iniciarInscricao() {
		listaCompetidores = new ArrayList<Competidor>();
	}
	
	public static void inscreverCompetidor(Competidor comp) {
		listaCompetidores.add(comp);
	}
}

class TesteComparator implements Comparator<Competidor>{
	@Override
	public int compare(Competidor o1, Competidor o2) {
		return o1.getCodigoInscricao() - o2.getCodigoInscricao();
	}	
}