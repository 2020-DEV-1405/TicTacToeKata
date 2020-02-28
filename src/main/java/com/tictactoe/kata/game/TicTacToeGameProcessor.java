package com.tictactoe.kata.game;

import org.springframework.stereotype.Component;

/**
 * Tic Tac Toe game processing class that calculate outcome of game based on
 * both player choices.
 * 
 * @author AKS1405
 *
 */
@Component
public class TicTacToeGameProcessor {

	private GameStateEnum[][] board = new GameStateEnum[3][3];

	// Initialize board array with blank state of game in constructor
	public TicTacToeGameProcessor() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = GameStateEnum.BLANK;
			}
		}
	}
	
	/**
	 * Mark cross in game board and change state of that square to cross and return
	 * boolean if state changes successfully
	 * 
	 * @param row
	 * @param col
	 * @return boolean
	 */
	public boolean markCross(int row, int col) {
		return mark(row, col, GameStateEnum.CROSS);
	}

	/**
	 * Mark cross in game board and change state of that square to cross and return
	 * boolean if state changes successfully
	 * 
	 * @param row
	 * @param col
	 * @param gameState
	 * @return boolean
	 */
	private boolean mark(int row, int col, GameStateEnum gameState) {
		if (board[row][col] == GameStateEnum.BLANK) {
			board[row][col] = gameState;			
			return true;
		}
		return false;
	}

		
	/**
	 * This method gives current state of board at any time
	 * 
	 * @return GAME_STATE[][]
	 */
	public GameStateEnum[][] getBoard() {
		return this.board;
	}

	/**
	 * This method finds whether at any location on board is marked with circle or
	 * not
	 * 
	 * @param row
	 * @param col
	 * @return boolean
	 */
	public boolean isCross(int row, int col) {
		return board[row][col] == GameStateEnum.CROSS;
	}
}
