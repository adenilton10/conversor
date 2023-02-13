package br.com.conversorMoedas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Funcao funcao = new Funcao();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		
		String opcoes = menuPrincipal.Executar();
		
		switch(opcoes) {
		case "conversor de moeda":
			try{
				int continuar = 0;
				
				while(continuar == 0) {
					
					String valor2 = JOptionPane.showInputDialog("Insira um valor");
					double valorinserido2 = Double.parseDouble(valor2);
					funcao.Converter(valorinserido2);
					continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?", "aviso", JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(continuar == 1) {
						JOptionPane.showMessageDialog(null, "Progama finalizado");
					}if(continuar == 2) {
						JOptionPane.showMessageDialog(null, "Progama concluído");
					}if(continuar == 0) {
						menuPrincipal.Executar();
					}
				}	
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "valor invalido so aceitamos numeros");
			}
				
		}
		
	}
	
}

