package lista01;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int[] values = new int[3];
		
		int biggestValue = 0;
		
		JOptionPane.showMessageDialog(null, "Você deverá informar 3 números inteiros diferentes a seguir", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			for (int i = 0; i < 3; i++) {
				values[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um " + (i+1) + "º valor."));
				biggestValue = values[0];
				if (values[i] > biggestValue) {
					biggestValue = values[i];
				};
			};
		} while ((values[0] == values[1]) || (values[1] == values[2]) || (values[0] == values[2]));
		
		JOptionPane.showMessageDialog(null, biggestValue, "O maior valor inserido foi:", JOptionPane.INFORMATION_MESSAGE);

	}

}
