package br.com.conversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {

	public void Converter(double valorinserido) {

		ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();

		String opcoes = JOptionPane.showInputDialog(null, "opções de coversão", "Moedas", JOptionPane.PLAIN_MESSAGE,null,
				new Object[] { "Reais a dolares", "Reais a Euros", "Reais a Libras", "Reais a Yenes",
						"Reais a Won Coreano", "Dolares a Reais", "Euros a Reais", "Libras a Reais" },"escolha").toString();
		
		switch (opcoes) {
		case "Reais a dolares":
			conversorDeMoeda.ReaisParaDolar(valorinserido);
			break;

		case "Reais a Euros":
			conversorDeMoeda.ReaisParaEuros(valorinserido);
			break;

		case "Reais a Libras":
			conversorDeMoeda.ReaisParaLibra(valorinserido);
			break;
			
		case  "Reais a Yenes":
			conversorDeMoeda.ReaisParaYenes(valorinserido);
			break;
			
		case "Reais a Won Coreano":
			conversorDeMoeda.ReaisParaWonCoreano(valorinserido);
			break;
			
		case "Dolares a Reais":
			conversorDeMoeda.DolarParareais(valorinserido);
			break;
			
		case "Euros a Reais":
			conversorDeMoeda.EuroParaReais(valorinserido);
			break;
		
		case "Libras a Reais" :
			conversorDeMoeda.LibrasParaReais(valorinserido);
			break;
			
		}

	}

}