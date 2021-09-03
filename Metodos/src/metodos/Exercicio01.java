package metodos;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		calculateAge(getYear());

	}
	
	public static int getYear() {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
		
		while (year <= 0) {
			year = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
		}
		
		return year;
		
	}
	
	public static void calculateAge(int year) {
		
		int userAge = 2021-year;
		
		JOptionPane.showMessageDialog(null, "Você tem "+userAge+" anos (ou irá fazer ainda esse ano).");
		
	}

}
