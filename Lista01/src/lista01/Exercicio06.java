package lista01;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int totalResult = 0;
		
		int stopDecision = 0;
		
		int secondValue = 0;
		
		int firstValue = Integer.parseInt(JOptionPane.showInputDialog("Insira um primeiro valor"));
		
		do {		
					
		int operationSymbol = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero respectivo ao tipo de conta que deseja fazer:"
				+ "\n 1 - Adi��o"
				+ "\n 2 - Subtra��o"
				+ "\n 3 - Multiplica��o"
				+ "\n 4 - Divis�o"));
		
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
			JOptionPane.showMessageDialog(null, "Caractere inv�lido inserido!", "ATEN��O", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
		firstValue = totalResult;
				
		stopDecision = Integer.parseInt(JOptionPane.showInputDialog("O c�lculo j� foi efetuado. Deseja continuar a opera��o � partir de seu resultado?"
				+ "\n Insira '1' para Sim ou qualquer outro caractere para ver o resultado"));
		} while (stopDecision == 1);
		
		JOptionPane.showMessageDialog(null, totalResult, "Resultado:", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
