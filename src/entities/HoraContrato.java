package entities;

import java.time.LocalDate;

public class HoraContrato {
	
	private LocalDate data;
	private double valorHora;
	private Integer horas;
	
	public HoraContrato(LocalDate data, double valorHora, Integer horas) {
		this.data = data;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public  double totalValor() {
		return (double)valorHora*horas;
	}

	@Override
	public String toString() {
		return "HoraContrato [data=" + data + ", valorHora=" + valorHora + ", horas=" + horas + "]";
	}
	
	
	
	
	

}
