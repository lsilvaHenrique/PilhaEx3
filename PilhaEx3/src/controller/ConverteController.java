package controller;

import sp.fateczl.lucas.PilhaInt.PilhaInt;

public class ConverteController {
public ConverteController() {}
	
	public String decToBin(int numDecimal) {
		int resto;
		String result = "";
		PilhaInt pilha = new PilhaInt();
		
		while(numDecimal > 0) {
			resto = numDecimal % 2;
			pilha.push(resto);
			numDecimal /= 2;
		}
		while(!pilha.isEmpty()) {
			try {
				result += Integer.toString(pilha.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
