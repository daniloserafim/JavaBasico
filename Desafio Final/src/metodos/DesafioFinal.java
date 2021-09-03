package metodos;

import javax.swing.JOptionPane;

public class DesafioFinal {
	
	static int playerOneRightShotCounter = 0;

	static int playerTwoRightShotCounter = 0;

	public static void main(String[] args) {

		String[][] playerOneTable = setTableValues();

		String[][] playerTwoTable = setTableValues();

		String[][] playeOneBombTable = setTableValues();

		String[][] playerTwoBombTable = setTableValues();

		gameFirstExplanation(1, setExampleTable(setTableValues()));

		playerOneTable = submarinesPositioning(playerOneTable, 1);

		turnChangeMessage();

		gameFirstExplanation(2, setExampleTable(setTableValues()));

		playerTwoTable = submarinesPositioning(playerTwoTable, 2);

		turnChangeMessage();

		bombingTime(playerOneTable, playerTwoTable, playeOneBombTable, playerTwoBombTable);

	}

	public static void gameFirstExplanation(int playerNumber, String exampleTable) {

		String firstMessage = "Seja bem vindo jogador número " + playerNumber + "!" + "\n"
				+ "\n Você deverá informar as coordenadas referentes às posições que quer inserir seus 5 submarinos.";

		String secondMessage = "As coordenadas a serem inseridas devem seguir o padrão:" + "\n linha -> número"
				+ "\n coluna -> número";

		String thirdMessage = "Exemplo" + "\n" + "\n linha -> 3" + "\n coluna -> 4" + "\n" + "\n";

		String fourthMessage = "Agora é sua vez";

		JOptionPane.showMessageDialog(null, firstMessage);

		JOptionPane.showMessageDialog(null, secondMessage);

		JOptionPane.showMessageDialog(null, thirdMessage + exampleTable);

		JOptionPane.showMessageDialog(null, fourthMessage);
	}

	public static void gameSecondExplanation() {
		String firstMessage = "BOMBARDEIO" + "\n" + "\n Ganhe do seu adversário acertando bombas nos submarinos dele!";
		JOptionPane.showMessageDialog(null, firstMessage);
	}

	public static void findingTableErrorMessage() {
		JOptionPane.showMessageDialog(null, "Erro! Tabela não encontrada.");
	}

	public static void invalidInsertMessage() {
		JOptionPane.showMessageDialog(null, "Erro! Dígito inválido inserido.");
	}

	public static void replaceSubmarineMessage() {
		JOptionPane.showMessageDialog(null, "Erro! Esse espaço já está sendo ocupado.");
	}

	public static void submarinePositionedMessage(String currentTable) {
		JOptionPane.showMessageDialog(null, "Submarino posicionado com sucesso" + "\n" + "\n" + currentTable);
	}

	public static void rightShotMessage(String currentTable) {
		JOptionPane.showMessageDialog(null, "BOOOOOOOOMMMMMMM!!!!!!!!" + "\n" + "\n VOCÊ ACERTOU O SUBMARINO INIMIGO!"
				+ "\n" + "\n" + currentTable);
	}

	public static void missedShotMessage(String currentTable) {
		JOptionPane.showMessageDialog(null,
				"Glub!" + "\n" + "\n Esse é o barulho da sua bomba sumindo no oceano..." + "\n" + "\n" + currentTable);
	}

	public static void bonusPlayMessage(int playerNumber) {
		JOptionPane.showMessageDialog(null, "Boa jogada jogador número "+playerNumber+"! Prepare-se para uma rodada bônus!");
	}

	public static void lostPlayMessage() {
		JOptionPane.showMessageDialog(null, "Você errou! É a vez do seu adversário.");
	}

	public static void bombTimeMessage(int playerNumber) {
		JOptionPane.showMessageDialog(null, "É sua vez jogador " + playerNumber + ""
				+ "\n"
				+ "\n HORA DO BOMBARDEIO"
				+ "\n"
				+ "\n acerte os submarinos inimigos!");
	}

	public static void turnChangeMessage() {
		JOptionPane.showMessageDialog(null, "Muito bem, agora é a vez do seu adversário!");
	}

	public static void winMessage(int playerNumber, String currentTable) {
		JOptionPane.showMessageDialog(null,
				"PARABÉNS JOGADOR NÚMERO " + playerNumber + " VOCÊ GANHOU!!!" + "\n" + "\n" + currentTable);
	}

	public static String[][] setTableValues() {

		String[][] tableValues = new String[7][7];

		for (int line = 0; line < 7; line++) {
			for (int column = 0; column < 7; column++) {
				if (column == 0) {
					tableValues[line][column] = " " + Integer.toString(line) + " |";
				} else if (line == 0) {
					tableValues[line][column] = " " + Integer.toString(column) + " |";
				} else {
					tableValues[line][column] = "    |";
				}
				if (column == 6) {
					tableValues[line][column] += "\n";
				}
			}
		}
		return tableValues;
	}

	public static String setExampleTable(String[][] tableValues) {

		String exampleTable = "";

		for (int line = 0; line < 7; line++) {
			for (int column = 0; column < 7; column++) {
				if ((line == 3) && (column == 4)) {
					exampleTable += " x |";
				} else {
					exampleTable += tableValues[line][column];
				}
			}
		}
		return exampleTable;
	}

	public static String[][] submarinesPositioning(String[][] tableValues, int playerNumber) {

		boolean validation;

		int lineInsert = 0;

		int columnInsert = 0;

		String[][] tableDone = new String[7][7];

		for (int counter = 1; counter < 6; counter++) {
			do {
				lineInsert = getLineInsert(counter);

				columnInsert = getColumnInsert(counter);

				validation = submarinePositionValidation(lineInsert, columnInsert, tableValues);

				tableDone = insertSubmarinePositions(lineInsert, columnInsert, tableValues);

			} while (validation == false);
		}
		return tableDone;
	}

	public static int getLineInsert(int numeration) {

		String coordinate = "linha";
		int line = 0;
		boolean validation;

		do {
			if (numeration < 6) {
				line = insertSubmarineInputMessage(numeration, coordinate);
			} else {
				line = insertBombInputMessage(coordinate);
			}
			validation = postitionValidation(line);
		} while (validation == false);
		return line;
	}

	public static int getColumnInsert(int numeration) {

		String coordinate = "coluna";
		int column = 0;
		boolean validation;

		do {
			if (numeration < 6) {
				column = insertSubmarineInputMessage(numeration, coordinate);
			} else {
				column = insertBombInputMessage(coordinate);
			}
			validation = postitionValidation(column);
		} while (validation == false);
		return column;
	}

	public static int insertSubmarineInputMessage(int numeration, String coordinate) {
		int position = Integer.parseInt(JOptionPane.showInputDialog(
				"Insira as coordenadas do seu " + numeration + "º submarino" + "\n" + "\n" + coordinate));
		return position;
	}

	public static int insertBombInputMessage(String coordinate) {

		int position = Integer.parseInt(JOptionPane
				.showInputDialog("Insira as coordenadas de onde deseja jogar sua bomba!" + "\n" + "\n" + coordinate));
		return position;
	}

	public static boolean postitionValidation(int position) {
		if ((position < 1) || (position > 6)) {
			invalidInsertMessage();
			return false;
		} else {
			return true;
		}
	}

	public static boolean submarinePositionValidation(int line, int column, String[][] tableValues) {

		if (tableValues[line][column] == " o |") {
			replaceSubmarineMessage();
			return false;
		} else {
			submarinePositionedMessage(showCurrentTable(insertSubmarinePositions(line, column, tableValues)));
			return true;
		}
	}

	public static int bombPositionValidation(int line, int column, String[][] enemyTable, String[][] bombTable,
			int rightShotCounter) {

		if (enemyTable[line][column] == " o |") {
			rightShotCounter += 1;
			System.out.println(rightShotCounter);
			rightShotMessage(showCurrentTable(insertBombPositions(line, column, bombTable, rightShotCounter)));
		} else {
			missedShotMessage(showCurrentTable(insertBombPositions(line, column, bombTable, rightShotCounter)));
		}

		return rightShotCounter;
	}

	public static String[][] insertSubmarinePositions(int line, int column, String[][] tableValues) {

		tableValues[line][column] = " o |";
		if (column == 6) {
			tableValues[line][column] += "\n";
		}
		return tableValues;
	}

	public static String[][] insertBombPositions(int line, int column, String[][] bombTable, int rightShotCounter) {

		bombTable[line][column] = " x |";
		if (column == 6) {
			bombTable[line][column] += "\n";
		}
		bombTable[0][0] = " " + Integer.toString(rightShotCounter) + " |";
		return bombTable;
	}

	public static String showCurrentTable(String[][] tableValues) {

		String currentTable = "";

		for (int line = 0; line < 7; line++) {
			for (int column = 0; column < 7; column++) {
				currentTable += tableValues[line][column];
			}
		}
		return currentTable;
	}

	public static void bombingTime(String[][] playerOneTable, String[][] playerTwoTable, String[][] playerOneBombTable,
			String[][] playerTwoBombTable) {

		boolean bonusPlay = false;

		while (true) {
			
			boolean bonusPlayCache = false;
			
			do {
				bonusPlay = false;
				String currentScore = playerOneBombTable[0][0];
				playerOneBombTable = bombDrop(playerOneBombTable, playerTwoTable, 1,
						bonusPlayCache);
				String newScore = playerOneBombTable[0][0];
				winValidation(playerOneBombTable, 1);
				bonusPlay = bonusPlayValidation(currentScore, newScore);
				bonusPlayCache = bonusPlay;
				//playerOneRightShotCounter = newScore;
			} while (bonusPlay == true);
			
			bonusPlayCache = false;

			do {
				bonusPlay = false;
				String currentScore = playerTwoBombTable[0][0];
				playerTwoBombTable = bombDrop(playerTwoBombTable, playerOneTable, 2,
						bonusPlayCache);
				String newScore = playerTwoBombTable[0][0];
				winValidation(playerTwoBombTable, 2);
				bonusPlay = bonusPlayValidation(currentScore, newScore);
				bonusPlayCache = bonusPlay;
				//playerTwoRightShotCounter = newScore;
			} while (bonusPlay == true);
		}
	}

	public static String[][] bombDrop(String[][] bombTable, String[][] enemyTable,
			int playerNumber, boolean bonusPlayCache) {

		int lineInsert = 0;

		int columnInsert = 0;

		if (bonusPlayCache == false) {
			bombTimeMessage(playerNumber);
		} else {
			bonusPlayMessage(playerNumber);
		}

		lineInsert = getLineInsert(6);

		columnInsert = getColumnInsert(6);

		playerOneRightShotCounter = bombPositionValidation(lineInsert, columnInsert, enemyTable, bombTable, playerOneRightShotCounter);
		System.out.println(playerOneRightShotCounter);
		return insertBombPositions(lineInsert, columnInsert, bombTable, playerOneRightShotCounter);
	}

	public static void winValidation(String[][] bombTable, int playerNumber) {
		if (bombTable[0][0].equals(" 5 |")) {
			gameOver(playerNumber, bombTable);
		}
	}

	public static void gameOver(int playerNumber, String[][] bombTable) {
		winMessage(playerNumber, showCurrentTable(bombTable));
		System.exit(0);
	}

	public static boolean bonusPlayValidation(String currentScore, String newScore) {
		//System.out.println(currentScore);
		//System.out.println(newScore);
		if (currentScore.equals(newScore)) {
			return false;
		} else {
			return true;
		}
	}
}
