package lista02;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		float brass = 0;

		while (brass <= 0) {

			brass = Float.parseFloat(JOptionPane.showInputDialog("Quantos quilos de latão você quer fabricar?"));

		}

		float zinc = (brass / 100) * 30;

		float copper = (brass / 100) * 70;

		JOptionPane.showMessageDialog(null, "Para fabricar " + brass + "kg de latão, você precisará de " + zinc
				+ "kg de Zinco e " + copper + "kg de cobre.", "Resultado:", JOptionPane.INFORMATION_MESSAGE);

	}

}
