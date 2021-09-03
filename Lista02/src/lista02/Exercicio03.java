package lista02;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int value = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

		String finalMessage = "";

		while (true) {
			int option = Integer.parseInt(JOptionPane
					.showInputDialog("O que tu quer?" + "\n 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero"
							+ "\n 2 - Verificar se o n�mero � par" + "\n 3 - Verificar se o n�mero est� entre 0 e 1000"
							+ "\n 4 - Sair"));

			switch (option) {
			case 1:
				int parameter = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor par�metro"));

				if (value % parameter == 0) {
					finalMessage = "Sim, "+ value +" � um m�ltiplo de " + parameter;
				} else {
					finalMessage = "N�o, "+ value +" n�o � um m�ltiplo de " + parameter;
				};
				break;
			case 2:
				if (value % 2 == 0) {
					finalMessage = "Sim, "+ value +" � um n�mero par";
				} else {
					finalMessage = "N�o, "+ value +" n�o � um n�mero par";
				};
				break;
			case 3:
				if ((value > 0) && (value < 1000)) {
					finalMessage = "Sim, o n�mero "+ value +" est� entre 0 e 1000";					
				} else {
					finalMessage = "N�o, o n�mero "+ value +" n�o est� entre 0 e 1000";
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				finalMessage = "Op��o inv�lida!";
				break;
			};
			
			JOptionPane.showMessageDialog(null, finalMessage, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}

	}

}
