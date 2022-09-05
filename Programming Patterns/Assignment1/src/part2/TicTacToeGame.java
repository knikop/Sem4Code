/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *The TicTacToe Game Implementation
 * @author Kosta Nikopoulos
 */
public class TicTacToeGame {
    char[][] grid = new char[3][3];
    int totalMoves = 0;

    TicTacToeGame() {
        reset(3);
    }
    /** Starts a new game on a board of size x size.
    @return void.
    */
    public void reset(int size) {
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                grid[i][j] = ' ';
            }
        }
    }
    
    //Print X or O
    public void print() {
        for (char[] row : grid) {
            for (char col : row) {
                System.out.print("| " + col + " ");
            }
            System.out.println("|");
        }
    }
    
    /** Retrieves either ' ', 'X' or 'O' from the position x and y on the 
    board.
    @return Char ' ', 'X' or 'O'.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. */
    //The Value of the coordinates on the TTT Board
    public char boardValue(int x, int y) throws TicTacToeException {
        if (y >= grid.length || y < 0 || x >= grid[y].length || x < 0) {
            throw new TicTacToeException("Invalid coordinates");
        }
        return grid[y][x];
    }
    
    /** Simulates player A move. Player A plays 'X'.
    @return 1 if player A won. 0 if this was the last move and the board 
    is full, thus draw. -1 if the game is not finished.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. TicTacToeException("Cell is already used") if 
    the cell at coordinates x,y was already used before */
    //To Move Player A
    public int playerAMove(int x, int y) throws TicTacToeException {
        return makeMove(x, y, 'X');
    }
    
    /** Simulates player B move. Player B plays 'O'.
    @return 1 if player B won. 0 if this was the last move and the board 
    is full, thus draw. -1 if the game is not finished.
    @throws TicTacToeException("Invalid coordinates") if values x,y 
    exceeds board size. TicTacToeException("Cell is already used") if 
    the cell at coordinates x,y was already used before */
    //To Move Player B
    public int playerBMove(int x, int y) throws TicTacToeException {
        return makeMove(x, y, 'O');
    }
    
    //Players making their moves
    public int makeMove(int x, int y, char player) throws TicTacToeException {
        x -= 1;
        y -= 1;

        char valueAtCell = boardValue(x, y);

        if (valueAtCell != ' ') {
            throw new TicTacToeException("Cell is already used " + valueAtCell);
        }

        if (totalMoves == grid.length * grid[0].length) {
            return 0;
        }

        char res = win();
        if (res == player) {
            return 1;
        }

        grid[y][x] = player;
        res = win();

        if (res == player) {
            return 1;
        }

        return -1;
    }
    
    //win conditions
    public char win() {
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
            return grid[0][0];
        }
        if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
            return grid[1][0];
        }
        if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
            return grid[2][0];
        }
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
            return grid[0][0];
        }
        if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]) {
            return grid[0][1];
        }
        if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
            return grid[0][2];
        }
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return grid[0][0];
        }
        if (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]) {
            return grid[2][0];
        }
        return ' ';
    }
}
