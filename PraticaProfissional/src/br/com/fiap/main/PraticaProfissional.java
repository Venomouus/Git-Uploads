package br.com.fiap.main;

import java.util.Calendar;
import java.util.Scanner;

public class PraticaProfissional {
	
	Scanner scanner = new Scanner(System.in);
	
	private String numeroContrato;
	
	private String date;
	
	private double valorContrato;
	
	private int numeroParcelas;
	
	public PraticaProfissional(String numeroContrato, String date, double valorContrato, int numeroParcelas) {
		super();
		this.numeroContrato = numeroContrato;
		this.date = date;
		this.valorContrato = valorContrato;
		this.numeroParcelas = numeroParcelas;
	}
	
	public double CalculaParcela (String numeroContrato, String date, double valorContrato, int numeroParcelas, double resultado) {
		for (int i = 0; i < numeroParcelas; i++){
			resultado = (valorContrato / numeroParcelas) * (1.01 * i) * 1.02;
			System.out.println("Parcelas: " + date + " - " + resultado);
				
		}
		return resultado;
	}


	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	

}
