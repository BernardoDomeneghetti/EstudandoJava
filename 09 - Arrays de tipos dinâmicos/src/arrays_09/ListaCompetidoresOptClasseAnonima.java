package arrays_09;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import base.Competidor;

public class ListaCompetidoresOptClasseAnonima {
	
	private static ArrayList<Competidor> ListaCompetidoresOptimizada;
	
	
	public static void competir() throws Exception {
		if (ListaCompetidoresOptimizada == null 
				|| ListaCompetidoresOptimizada.size() < 1) 
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
		
		for (Competidor comp:ListaCompetidoresOptimizada) {
			comp.setPontuacao(new Random().nextInt());
		}
		
		System.out.println("Ufa... competidores cansados! Competição finalizada!");
	}
	
	public static void listarInscricaoCompetidores() {
		
				
		Collections
			.sort(
				ListaCompetidoresOptimizada,
				//Note como o método que na classe ListaCompetidores que era implementada através de 
				//uma classe criada especificamente para encapsular esse método
				new Comparator<Competidor>() {
					@Override
					public int compare(Competidor o1, Competidor o2) {
						return o1.getCodigoInscricao() - o2.getCodigoInscricao();
					}
				}
			);
		
		
		
		System.out.println("Listagem de inscrições: ");
		
		for (Competidor competidor: ListaCompetidoresOptimizada) {	
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
		Collections.sort(ListaCompetidoresOptimizada);
		
		for (Competidor competidor: ListaCompetidoresOptimizada) {
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
		ListaCompetidoresOptimizada = new ArrayList<Competidor>();
	}
	
	public static void inscreverCompetidor(Competidor comp) {
		ListaCompetidoresOptimizada.add(comp);
	}
}