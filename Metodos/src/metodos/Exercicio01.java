package metodos;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		calculateAge(getYear());

	}
	
	public static int getYear() {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano voc� nasceu?"));
		
		while (year <= 0) {
			year = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano voc� nasceu?"));
		}
		
		return year;
		
	}
	
	public static void calculateAge(int year) {
		
		int userAge = 2021-year;
		
		JOptionPane.showMessageDialog(null, "Voc� tem "+userAge+" anos (ou ir� fazer ainda esse ano).");
		
	}

}
