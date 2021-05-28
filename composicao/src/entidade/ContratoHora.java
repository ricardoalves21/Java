package entidade;

import java.util.Date;

public class ContratoHora {
	
	// ATRIBUTOS
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	// CONSTRUTOR PADR�O
	public ContratoHora() {		
	}

	// CONSTRUTOR COM ARGUMENTOS
	public ContratoHora(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	// METODOS GETTERS E SETTERS
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorPorHora * horas;
	}
	
}
