/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *The Interface for the TicTacToe Game
 * @author Kosta Nikopoulos
 */
public interface TicTacToeInterface {
    
    /** Starts a new game on a board of size x size.
    @return void. */
    public void reset(int size);

    /** Retrieves either ' ', 'X' or 'O' from the position x and y on the 
    board.
    @return Char ' ', 'X' or 'O'.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. */
    public char boardValue(int x, int y);

    /** Simulates player A move. Player A plays 'X'.
    @return 1 if player A won. 0 if this was the last move and the board 
   is full, thus draw. -1 if the game is not finished.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. TicTacToeException("Cell is already used") if 
    the cell at coordinates x,y was already used before */
    public int playerAMove(int x, int y);
    
    /** Simulates player B move. Player B plays 'O'.
    @return 1 if player B won. 0 if this was the last move and the board 
   is full, thus draw. -1 if the game is not finished.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. TicTacToeException("Cell is already used") if 
    the cell at coordinates x,y was already used before */
    public int playerBMove(int x, int y); 
    
}
