package lista01;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		String time[] = { "horas", "minutos", "segundos" };

		int[] values = new int[3];
		for (int i = 0; i < 3; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um montante de " + time[i]));
		}
		;

		int totalSeconds = ((values[0] * 3600) + (values[1] * 60) + (values[2]));

		JOptionPane.showMessageDialog(null, totalSeconds, "A soma dos valores inseridos em segundos é:",JOptionPane.INFORMATION_MESSAGE);

	}
}