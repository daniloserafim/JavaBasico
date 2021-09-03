package lista02;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Exercicio06 {

	public static void main(String[] args) {
		
		DecimalFormat d = new DecimalFormat ("#,##0.00");

		int biggerValue = 0;

		int bestMonth = 0;

		int smallerValue = 0;

		int worstMonth = 0;

		float sellsAverage = 0;

		float evensAverage = 0;

		float secondSemesterAverage = 0;

		int[] values = new int[12];
		for (int i = 0; i < 12; i++) {
			
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor total de vendas do " + (i + 1) + "º mês: "));
			
			while (values[i]<0) {
				values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor total de vendas do " + (i + 1) + "º mês: "));
			}

			if (values[i] > biggerValue) {
				biggerValue = values[i];
				bestMonth = i + 1;
			}

			if (i != 0) {
				if (values[i] < smallerValue) {
					smallerValue = values[i];
					worstMonth = i + 1;
				}

				sellsAverage = (sellsAverage + values[i]) / 2;
				if ((i + 1) % 2 == 0) {
					evensAverage = (evensAverage + values[i]) / 2;
					System.out.println(values[i]);
					System.out.println(evensAverage);
				}

			} else {
				smallerValue = values[i];
				worstMonth = i + 1;

				sellsAverage = values[i];
				if ((i + 2) % 2 == 0) {
					evensAverage = values[i];
				}
			}

			if (i > 5) {
				if (i != 6) {
					secondSemesterAverage = (secondSemesterAverage + values[i]) / 2;
				} else {
					secondSemesterAverage = values[i];
				}
			}

		}

		JOptionPane.showMessageDialog(null, bestMonth, "Mês de melhores vendas:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, worstMonth, "Mês de píores vendas:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, d.format(sellsAverage), "Média de vendas no ano:", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, d.format(evensAverage), "Média de venda dos meses pares:",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, d.format(secondSemesterAverage), "Média de vendas do segundo semestre:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
