package model;

public class Pizza {
	private String nome;
	private String modifica��es;
	private double pre�o;
	private String tipo;
	private boolean bordaRecheada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModifica��es() {
		return modifica��es;
	}
	public void setModifica��es(String modifica��es) {
		this.modifica��es = modifica��es;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isBordaRecheada() {
		return bordaRecheada;
	}
	public void setBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}		
}
