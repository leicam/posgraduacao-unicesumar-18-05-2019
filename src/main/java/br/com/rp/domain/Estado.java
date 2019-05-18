package br.com.rp.domain;

public class Estado extends BaseEntity{
	private String sigla;
	private String descricao;
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Estado() {
		
	}
	
	public Estado(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}
}
