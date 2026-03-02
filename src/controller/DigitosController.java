package controller;

public class DigitosController {
	public int contaDigitos(int num) {
		
		/*
		 * se o numero ainda for menor que 10
		 * ainda assim tem um digito
		 * entao soma 1 ao todal de digitos e para a recursao
		 */
		if (num < 10) {
			return 1;
		}
		
		/*
		 * se o numero for maior que 10, faz a divisao
		 * inteira do numero e soma 1 ao total de digitos
		 */
		return 1 + contaDigitos(num/10);
	}
}
