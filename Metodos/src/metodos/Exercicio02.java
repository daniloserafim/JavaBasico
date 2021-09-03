package metodos;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		float[] grades = new float[3];

		for (int i = 0; i < 3; i++) {
			grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira sua " + (i+1) + "ª nota"));
			
			while (grades[i]<=0 || grades[i]>10) {
				grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira sua " + (i+1) + "ª nota"));
			}
		}

		int avaliationType = Integer.parseInt(JOptionPane.showInputDialog(
				"Insira qual tipo de média deve ser usada:" + "\n 1 - ponderada" + "\n 2 - aritmética"));

		if (avaliationType == 1) {

			int[] weights = new int[3];

			for (int i = 0; i < 3; i++) {
				weights[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o peso para a " + (i+1) + "ª nota"));
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

		JOptionPane.showMessageDialog(null, "Sua nota final é " + finalGrade);

		approvementValidation(finalGrade);

	}

	public static void arithmeticAverage(float grades[]) {

		float finalGrade = (grades[0] + grades[1] + grades[2]) / 3;

		JOptionPane.showMessageDialog(null, "Sua nota final é " + finalGrade);

		approvementValidation(finalGrade);

	}

	public static void approvementValidation(float finalGrade) {
		
		if (finalGrade<7) {
			JOptionPane.showMessageDialog(null, "Você está reprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Você está aprovado");
		}

	}

}
