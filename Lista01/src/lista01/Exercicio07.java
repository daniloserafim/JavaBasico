package lista01;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int counter = 0;
				
		int[] values = new int[10];
		for (int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
		}
		
		int singleValue = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que deseja achar:"));
		
		for (int i = 0; i < 10; i++) {
			if (singleValue == values[i]) {
				int positionValue = i+1;
				JOptionPane.showMessageDialog(null, "O valor "+singleValue+" está na posição "+positionValue+" da sequência.", "Resultado:", JOptionPane.INFORMATION_MESSAGE);
			} else {
				counter +=1;
			};
		};
		
		if (counter == 10) {
			JOptionPane.showMessageDialog(null, "O valor apontado não foi encontrado na sequência.", "Resultado:", JOptionPane.INFORMATION_MESSAGE);
		};
	}

}
