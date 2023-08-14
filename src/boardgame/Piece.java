package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// somente classes do mesmo pacote e subclasses e que podem acessar o board
	protected Board getBoard() {
		return board;
	}

	
	
	
	
}
