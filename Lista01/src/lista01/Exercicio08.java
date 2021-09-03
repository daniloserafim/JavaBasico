package lista01;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		int line = 0;

		int column = 0;

		int totalSum = 0;

		int[] monthSum = new int[6];

		int[][] values = new int[6][4];

		for (line = 0; line < 6; line++) {
			for (column = 0; column < 4; column++) {
				values[line][column] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do total de vendas da " + (column+1) + "ª semana do mês " + (line+1)));
				totalSum += values[line][column];
				monthSum[line] += values[line][column];
			}
		}
		
		for (int i = 0; i < 6; i++) {
			JOptionPane.showMessageDialog(null, monthSum[i], "Total de vendas no mês "+(i+1)+":", JOptionPane.INFORMATION_MESSAGE);
		};
		
		JOptionPane.showMessageDialog(null, totalSum, "Total vendido no semestre:", JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
