package lista01;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int[] values = new int[10];
		for (int i = 0; i < 10; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
		};
		
		String evens = "";
		int evensSum = 0;
		String odds = "";
		int oddsSum = 0;
		
		for (int i=0; i<10; i++) {
			if (values[i] % 2 == 0) {
				if (evens != "") {
					evens += ", ";
				}
				evens += values[i];
				evensSum += values[i]; 
			} else {
				if (odds != "") {
					odds += ", ";
				}
				odds += values[i];
				oddsSum += values[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, evens, "Valores pares inseridos:", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, evensSum, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, odds, "Valores ímpares inseridos:", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, oddsSum, "Soma dos valores ímpares", JOptionPane.INFORMATION_MESSAGE);
	}

}
