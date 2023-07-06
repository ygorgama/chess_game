package bordergame;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return row + ", " + column;
	}
}
