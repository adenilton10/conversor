package br.com.conversorMoedas;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public String Executar() {
		String opcoes = JOptionPane.showInputDialog(null, "escolha uma opção", "menu", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"conversor de moeda", "conversor de temperatura"}, "escolha").toString();
		return opcoes;
	}
	
}
