package lista02;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		int negativeValues = 0;
		
		int arrayLength = 0;

		while (arrayLength <= 0) {

			arrayLength = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores voc� quer que tenha o seu array?"));

		}

		int[] values = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));

			if (values[i] < 0) {
				negativeValues += 1;
			}
		}

		JOptionPane.showMessageDialog(null, negativeValues, "O n�mero de valores negativos inseridos �:",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
