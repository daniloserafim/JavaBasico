package lista01;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int ageOfMarjority = Integer.parseInt(JOptionPane.showInputDialog("Com quantos anos se atinge a maioridade civil no seu pa�s?"));
		
		int userAge = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		
		String userAgeCheckMessage;
		
		if (userAge < ageOfMarjority) {
			userAgeCheckMessage = "Voc� ainda n�o atingiu a maioridade civil."; 
		} else {
			userAgeCheckMessage = "Voc� j� atingiu a maioridade civil.";
		};
				
		JOptionPane.showMessageDialog(null, userAgeCheckMessage, "Resultado:", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
