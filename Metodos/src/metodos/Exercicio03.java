package metodos;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		discountCalculation(purchaseValue());		
		
	}
	
	public static double purchaseValue() {
		
		double value = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da sua compra"));
		
		while (value<=0) {
			value = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da sua compra"));
		}
		
		return value;
		
	}
	
	public static void discountCalculation(double purchaseValue) {
		
		double finalValue = 0;
		
		if (purchaseValue<=100) {
			finalValue = purchaseValue;
		} else if (purchaseValue>100 && purchaseValue<=200) {
			finalValue = purchaseValue-((purchaseValue/100)*20);
		} else {
			finalValue = purchaseValue-((purchaseValue/100)*30);
		}
		
		JOptionPane.showMessageDialog(null, "O preço final em reais da sua compra é de: "+finalValue);
		
	}

}
