package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entidade.enums.NivelTrabalhador;

public class Trabalhador {
	
	// ATRIBUTOS
	private String nome;
	private NivelTrabalhador nivel; // criando um atributo da classe 'NivelTrabalhado'
	private Double salarioBase;	
	private Departamento departamento; // criando um atributo da classe 'Departamento'
	private List<ContratoHora> contratos = new ArrayList<>(); // instanciando um objeto do tipo 'List' com o nome ContratoHora como sendo um 'ArrayList'
	
	// CONSTRUTOR PADRÃO
	public Trabalhador() {		
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	// METODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}	
}
