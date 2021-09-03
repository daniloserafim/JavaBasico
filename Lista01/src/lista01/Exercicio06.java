package lista01;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int totalResult = 0;
		
		int stopDecision = 0;
		
		int secondValue = 0;
		
		int firstValue = Integer.parseInt(JOptionPane.showInputDialog("Insira um primeiro valor"));
		
		do {		
					
		int operationSymbol = Integer.parseInt(JOptionPane.showInputDialog("Insira o número respectivo ao tipo de conta que deseja fazer:"
				+ "\n 1 - Adição"
				+ "\n 2 - Subtração"
				+ "\n 3 - Multiplicação"
				+ "\n 4 - Divisão"));
		
		secondValue = Integer.parseInt(JOptionPane.showInputDialog("Insira um segundo valor"));
		
		switch (operationSymbol) {
		case 1:
			totalResult = firstValue+secondValue;
			break;
		case 2:
			totalResult = firstValue-secondValue;
			break;
		case 3:
			totalResult = firstValue*secondValue;
			break;
		case 4:
			totalResult = firstValue/secondValue;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Caractere inválido inserido!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
		firstValue = totalResult;
				
		stopDecision = Integer.parseInt(JOptionPane.showInputDialog("O cálculo já foi efetuado. Deseja continuar a operação à partir de seu resultado?"
				+ "\n Insira '1' para Sim ou qualquer outro caractere para ver o resultado"));
		} while (stopDecision == 1);
		
		JOptionPane.showMessageDialog(null, totalResult, "Resultado:", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
