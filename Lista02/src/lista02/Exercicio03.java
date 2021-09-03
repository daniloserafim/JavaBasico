package lista02;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int value = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

		String finalMessage = "";

		while (true) {
			int option = Integer.parseInt(JOptionPane
					.showInputDialog("O que tu quer?" + "\n 1 - Verificar se o número é múltiplo de algum outro número"
							+ "\n 2 - Verificar se o número é par" + "\n 3 - Verificar se o número está entre 0 e 1000"
							+ "\n 4 - Sair"));

			switch (option) {
			case 1:
				int parameter = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor parâmetro"));

				if (value % parameter == 0) {
					finalMessage = "Sim, "+ value +" é um múltiplo de " + parameter;
				} else {
					finalMessage = "Não, "+ value +" não é um múltiplo de " + parameter;
				};
				break;
			case 2:
				if (value % 2 == 0) {
					finalMessage = "Sim, "+ value +" é um número par";
				} else {
					finalMessage = "Não, "+ value +" não é um número par";
				};
				break;
			case 3:
				if ((value > 0) && (value < 1000)) {
					finalMessage = "Sim, o número "+ value +" está entre 0 e 1000";					
				} else {
					finalMessage = "Não, o número "+ value +" não está entre 0 e 1000";
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				finalMessage = "Opção inválida!";
				break;
			};
			
			JOptionPane.showMessageDialog(null, finalMessage, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}

	}

}
