package lista01;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		int[] values = new int[2];

		for (int i = 0; i < 2; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um " + (i + 1) + "� valor."));
		};

		String evenValues = "";
		for (int i = values[0]; i < values[1]; i++) {
			if (i % 2 == 0) {
				if (evenValues != "") {
					evenValues += ", ";
				};
				evenValues += i;
			};
		};
		
		JOptionPane.showMessageDialog(null, evenValues, "Valores pares entre os dois n�meros inseridos por voc�:", JOptionPane.INFORMATION_MESSAGE);
	}

}
