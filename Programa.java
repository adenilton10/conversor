package br.com.conversorMoedas;

import javax.swing.JOptionPane;

public class Programa {

	public void Executar() {
		Funcao funcao = new Funcao();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		
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
		
	}

	
	
}
