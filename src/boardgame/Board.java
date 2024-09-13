package boardgame;

public class Board {

	private int row;
	private int coluns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		this.row = rows;
		this.coluns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColuns() {
		return coluns;
	}

	public void setColuns(int coluns) {
		this.coluns = coluns;
	}
		
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
