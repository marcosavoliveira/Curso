package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 5820445062228330250L;

	public ChessException(String msg) {
		super(msg);
	}
}
