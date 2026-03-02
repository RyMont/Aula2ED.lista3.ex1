package view;

import javax.swing.JOptionPane;

import controller.DigitosController;

public class Principal {
	public static void main(String[] args) {
		DigitosController dc = new DigitosController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
		int digitos = dc.contaDigitos(num);
		
		System.out.println("O total de digitos do número " +num +" é: " +digitos);
	}
}
