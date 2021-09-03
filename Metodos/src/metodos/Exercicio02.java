package metodos;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		float[] grades = new float[3];

		for (int i = 0; i < 3; i++) {
			grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira sua " + (i+1) + "� nota"));
			
			while (grades[i]<=0 || grades[i]>10) {
				grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira sua " + (i+1) + "� nota"));
			}
		}

		int avaliationType = Integer.parseInt(JOptionPane.showInputDialog(
				"Insira qual tipo de m�dia deve ser usada:" + "\n 1 - ponderada" + "\n 2 - aritm�tica"));

		if (avaliationType == 1) {

			int[] weights = new int[3];

			for (int i = 0; i < 3; i++) {
				weights[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o peso para a " + (i+1) + "� nota"));
			}

			weightedAverage(grades, weights);

		} else if (avaliationType == 2) {
			arithmeticAverage(grades);
		}
	}

	public static void weightedAverage(float grades[], int weights[]) {

		float values = 0;

		int weightsSum = 0;

		for (int i = 0; i < 3; i++) {
			values += grades[i] * weights[i];
			weightsSum += weights[i];
		}

		float finalGrade = (values / weightsSum);

		JOptionPane.showMessageDialog(null, "Sua nota final � " + finalGrade);

		approvementValidation(finalGrade);

	}

	public static void arithmeticAverage(float grades[]) {

		float finalGrade = (grades[0] + grades[1] + grades[2]) / 3;

		JOptionPane.showMessageDialog(null, "Sua nota final � " + finalGrade);

		approvementValidation(finalGrade);

	}

	public static void approvementValidation(float finalGrade) {
		
		if (finalGrade<7) {
			JOptionPane.showMessageDialog(null, "Voc� est� reprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� est� aprovado");
		}

	}

}
