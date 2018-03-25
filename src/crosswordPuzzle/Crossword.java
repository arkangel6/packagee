package crosswordPuzzle;

public class Crossword {

	private Square[][] puzzle;

	public Crossword(boolean[][] blackSquares) {
		for (int i = 0; i < blackSquares.length; i++) {
			for (int j = 0; j < blackSquares[i].length; j++) {

				if (toBeLabeled(i, j, blackSquares)) {
					\puzzle[i][j] = new Square(true, -1);
				} else {
					puzzle[i][j] = new Square(false, 1);
				}

			}
		}

	}

	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {

		if (blackSquares[r][c] == true) {
			return false;
		} else {
			return true;
		}
	}

}
