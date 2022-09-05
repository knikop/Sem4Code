/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.Scanner;
/**
 *The Main Class of TicTacToe
 * @author Kosta Nikopoulos
 */
public class TTTDriver {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TicTacToeGame game = new TicTacToeGame();

        int state = -1;
        char[] players = new char[] {'A', 'B'};
        int playerIndex = 0;

        while (state < 0) {
            game.print();
            try {
                System.out.println("Player " + players[playerIndex]);

                System.out.print("-> Enter row: ");
                int row = scanner.nextInt();

                System.out.print("-> Enter column: ");
                int col = scanner.nextInt();

                if (playerIndex == 0)
                    state = game.playerAMove(col, row);
                else
                    state = game.playerBMove(col, row);

            } catch (TicTacToeException ex) {
                System.out.println(ex.getMessage());
                continue;
            }

            if (playerIndex == 0) playerIndex = 1;
            else playerIndex = 0;
        }

        if (state == 0) {
            System.out.println("Game Draw");
        }
        else {
            if (playerIndex == 0) playerIndex = 1;
            else playerIndex = 0;;
            System.out.println("Player " + players[playerIndex] + " Won!");
        }
    }
}
