package lista02;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Exercicio05 {

	public static void main(String[] args) {

		DecimalFormat d = new DecimalFormat("#,##0.00");

		String done = "";

		float ageAverage = 0;

		float wageAverage = 0;

		int smokers = 0;

		int notSmokers = 0;

		int oldGoers = 0;

		float oldGoersPercentage = 0;

		int registereds = 0;

		do {

			int personAge = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

			int ifSmokes = Integer
					.parseInt(JOptionPane.showInputDialog("Informe se é fumante:" + "\n 1 - sim" + "\n 2 - não"));

			float wage = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário líquido em reais"));

			int clubTime = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses está no clube"));

			registereds += 1;

			ageAverage = (ageAverage + personAge) / 2;

			wageAverage = (wageAverage + wage) / 2;

			switch (ifSmokes) {
			case 1:
				smokers += 1;
				break;
			case 2:
				notSmokers += 1;
				break;
			}
			;

			if (clubTime > 3) {
				oldGoers += 1;
			}

			oldGoersPercentage = (oldGoers * 100) / registereds;

			done = JOptionPane.showInputDialog("Ainda há usuários a se registrarem?"
					+ "\n Insira 'encerrar' caso não ou qualquer outro caractere para continuar o cadastro.");

		} while (!done.equals("encerrar")==true);

		JOptionPane.showMessageDialog(null, ageAverage + " anos", "A média da idade das pessoas cadastradas é:",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "R$" + d.format(registereds),
				"A média salarial das pessoas cadastradas é de:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, smokers + " pessoas são fumantes e " + notSmokers + " pessoas não são",
				"Fumantes", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, oldGoersPercentage + "%",
				"Este é o tanto de pessoas cadastradas que são frequentadores há mais de 3 meses:",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
