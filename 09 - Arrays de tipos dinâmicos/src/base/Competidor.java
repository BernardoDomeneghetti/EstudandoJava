package base;

public class Competidor implements Comparable<Competidor>{
	private Integer codigoInscricao;
	private String nome;
	private Integer idade;
	private Integer pontuacao;
	
	public Competidor(Integer codigoInscricao, String nome, Integer idade) {
		super();
		this.codigoInscricao = codigoInscricao;
		this.nome = nome;
		this.idade = idade;
		this.pontuacao = 0;
	}
	
	public Integer getCodigoInscricao() {
		return codigoInscricao;
	}
	public void setCodigoInscricao(Integer codigoInscricao) {
		this.codigoInscricao = codigoInscricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	@Override
	public int compareTo(Competidor comp) {
		
		return Integer.compare(this.pontuacao, comp.pontuacao);
	}

}
