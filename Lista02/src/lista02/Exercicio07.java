package lista02;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {

		int line = 0;

		int column = 0;

		float[] average = new float[3];

		float[][] values = new float[4][3];

		float biggestValue = 0;

		String biggestValueSubject = "";

		String bimesterGrades = "";

		String allGrades = "";

		String[] subject = { "matem�tica", "f�sica", "qu�mica" };

		for (line = 0; line < 4; line++) {
			for (column = 0; column < 3; column++) {

				values[line][column] = Integer.parseInt(JOptionPane
						.showInputDialog("Insira sua nota do " + (line + 1) + "� bimestre em " + (subject[column])));
				
				while (values[line][column]<0) {
					values[line][column] = Integer.parseInt(JOptionPane
							.showInputDialog("Insira sua nota do " + (line + 1) + "� bimestre em " + (subject[column])));
				}

				if (allGrades != "") {
					if (column == 0) {
						allGrades += "\n";
					} else {
						allGrades += ", ";
					}
				}
				allGrades += values[line][column];

				if (line == 0) {
					average[column] = values[line][column];
					biggestValue = values[line][column];
					biggestValueSubject = subject[column];
				} else {
					average[column] = (average[column] + values[line][column]) / 2;
					if (biggestValue < values[line][column]) {
						biggestValue = values[line][column];
						biggestValueSubject = subject[column];
					}
				}
			}
		}

		while (true) {

			int option = Integer.parseInt(JOptionPane
					.showInputDialog("O que voc� deseja ver?" + "\n 1 - Todas as notas de todas as disciplinas"
							+ "\n 2 - Qual a maior nota e em qual disciplina foi"
							+ "\n 3 - A m�dia das notas de alguma disciplina" + "\n 4 - As notas de um dos bimestres"
							+ "\n 5 - Encerrar"));

			switch (option) {
			case 1:
				JOptionPane.showMessageDialog(null, "Mat. Fis. e Qui. \n"+allGrades, "Todas as notas",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, biggestValue + " em " + biggestValueSubject, "Maior nota",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				int index = (Integer.parseInt(JOptionPane.showInputDialog("A m�dia de qual disciplina deseja ver?"
						+ "\n 1 - matem�tica" + "\n 2 - f�sica" + "\n 3 - qu�mica"))) - 1;
				JOptionPane.showMessageDialog(null, average[index], "M�dia de " + subject[index],
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				int bimester = (Integer.parseInt(JOptionPane.showInputDialog("As notas de qual bimestre deseja ver?")))- 1;

				for (int i = 0; i < 3; i++) {
					if (bimesterGrades != "") {
						bimesterGrades += ", ";
					}
					bimesterGrades += values[bimester][i];
				}
				JOptionPane.showMessageDialog(null, "Mat. Fis. e Qui. \n"+bimesterGrades,
						"Notas " + bimester + "� bimestre",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o v�lida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			;

		}
	}

}
