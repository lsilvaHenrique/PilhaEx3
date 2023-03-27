package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController c = new ConverteController();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		JOptionPane.showMessageDialog(null, "Numero em binario: " + c.decToBin(numero));
	}

}
