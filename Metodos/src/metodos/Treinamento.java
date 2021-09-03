package metodos;

import javax.swing.JOptionPane;

public class Treinamento {

	public static void main(String[] args) {

		int peso = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos quilos voc� tem"));

		while (peso <= 0) {
			mostraErroPeso();
			peso = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos quilos voc� tem"));
		}
		;

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira quantos metros voc� tem"));

		while (altura <= 0) {
			mostraErroAltura();
			altura = Double.parseDouble(JOptionPane.showInputDialog("Insira quantos metros voc� tem"));
		}
		;
		
		double imc = calculaIndice(peso,altura);
		verificaIndice(imc);
	};

	public static double calculaIndice(int peso, double altura) {

		double imc = peso / (altura * altura);

		return imc;

	};

	public static void verificaIndice(double imc) {

		if (imc < 17) {
			JOptionPane.showMessageDialog(null, "Voc� est� muito abaixo do peso! �ndice: " + imc);
		} else if (imc == 17 || imc <= 18.49) {
			JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso! �ndice: " + imc);
		} else if (imc <= 24.99) {
			JOptionPane.showMessageDialog(null, "Voc� est� com o peso adequado! �ndice: " + imc);
		} else if (imc <= 29.99) {
			JOptionPane.showMessageDialog(null, "Voc� est� acima do peso! �ndice: " + imc);
		} else if (imc <= 34.99) {
			JOptionPane.showMessageDialog(null, "VVoc� est� com obesidade tipo I! �ndice: " + imc);
		} else if (imc <= 39.99) {
			JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo II! �ndice: " + imc);
		} else if (imc >= 40) {
			JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo III! �ndice: " + imc);
		}

	};

	public static void mostraErroPeso() {

		JOptionPane.showMessageDialog(null, "Peso inv�lido digitado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
	};

	public static void mostraErroAltura() {

		JOptionPane.showMessageDialog(null, "Altura inv�lida digitada!", "Erro", JOptionPane.INFORMATION_MESSAGE);
	};
}
