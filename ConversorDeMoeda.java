package br.com.conversorMoedas;

import javax.swing.JOptionPane;

public class ConversorDeMoeda {

	public void ReaisParaDolar(double valorRecebido) {
		double valorDolar = valorRecebido/ 5.13;
		valorDolar = (double) Math.round(valorDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "o valor convertido é: " + valorDolar + " dolares");
				
	}
	
	public void ReaisParaEuros(double valorRecebido) {
		
		double moedaEuro = valorRecebido / 5.53;
		moedaEuro = (double) Math.round(moedaEuro * 100) / 100;
		JOptionPane.showConfirmDialog(null, "O valor convertido é: " + moedaEuro + " Euro");
		
	}
	
	public void ReaisParaLibra(double valorInserido) {
		double moedaLibra = valorInserido / 6.25;
		moedaLibra = (double) Math.round(moedaLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é: " + moedaLibra + " Libras");
	}
	
	public void ReaisParaYenes(double valorinserido) {
		double moedaYenes = valorinserido / 0.040;
		moedaYenes = (double) Math.round(moedaYenes * 100) / 100;
		JOptionPane.showMessageDialog(null,  "O valor convertido é: " + moedaYenes + " Yenes");
		
	}
	
	public void ReaisParaWonCoreano(double valorinserido) {
		
		double moedaWonCoreano = valorinserido / 240.95;
		moedaWonCoreano = (double) Math.round(moedaWonCoreano * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é: " + moedaWonCoreano + " Won Coreano");
		
	}

	public void DolarParareais(double valorinserido) {
		
		double moedaReal = valorinserido * 5.13;
		moedaReal = (double) Math.round(moedaReal * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é: " + moedaReal + " Reais");
	}

	public void EuroParaReais(double valorinserido) {
		double moedaReal = valorinserido * 0.18;
		moedaReal = (double) Math.round(moedaReal * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é: " + moedaReal + " Reais");
		
	}

	public void LibrasParaReais(double valorinserido) {
		
		double moedaReal = valorinserido * 6.30;
		moedaReal = (double) Math.round(moedaReal * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é: " + moedaReal + " Reais");
	}
	
}
