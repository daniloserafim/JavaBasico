package lista02;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		int totalSum = 0;

		String finalGrade = "";

		float gradesAverage = 0;

		int[] values = new int[4];

		for (int i = 0; i < 4; i++) {

			while (values[i] <= 0) {
				values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe sua " + (i + 1) + "ª nota: "));

				totalSum += values[i];

				if (i == 3) {

					gradesAverage = totalSum / 4;

					if (gradesAverage < 7) {
						finalGrade = "D";
					} else if (gradesAverage < 8) {
						finalGrade = "C";
					} else if (gradesAverage < 9) {
						finalGrade = "B";
					} else {
						finalGrade = "A";
					}
					;

				}
			}
			;
		}
		;

		JOptionPane.showMessageDialog(null, finalGrade, "A média de suas notas foi conceito:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
