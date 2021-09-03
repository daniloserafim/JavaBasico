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
					.parseInt(JOptionPane.showInputDialog("Informe se � fumante:" + "\n 1 - sim" + "\n 2 - n�o"));

			float wage = Float.parseFloat(JOptionPane.showInputDialog("Informe seu sal�rio l�quido em reais"));

			int clubTime = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos meses est� no clube"));

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

			done = JOptionPane.showInputDialog("Ainda h� usu�rios a se registrarem?"
					+ "\n Insira 'encerrar' caso n�o ou qualquer outro caractere para continuar o cadastro.");

		} while (!done.equals("encerrar")==true);

		JOptionPane.showMessageDialog(null, ageAverage + " anos", "A m�dia da idade das pessoas cadastradas �:",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "R$" + d.format(registereds),
				"A m�dia salarial das pessoas cadastradas � de:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, smokers + " pessoas s�o fumantes e " + notSmokers + " pessoas n�o s�o",
				"Fumantes", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, oldGoersPercentage + "%",
				"Este � o tanto de pessoas cadastradas que s�o frequentadores h� mais de 3 meses:",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
