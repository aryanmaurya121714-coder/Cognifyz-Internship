import java.util.Scanner;

public class Task_1_Tic_Tac_Toe_Game {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';

        for (int turn = 1; turn <= 9; turn++) {
            printBoard();
            System.out.println("Player " + player + ", enter row and column (1-3): ");
            System.out.println(" enter row: ");
            int row = sc.nextInt() - 1;
            System.out.println( " \nenter column: ");
            int col = sc.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move! Try again.");
                turn--;
                continue;
            }

            board[row][col] = player;

            if (checkWin(player)) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        printBoard();
        System.out.println("Game Draw!");
    }

    static void printBoard() {
        System.out.println("-------------");
        for (char[] row : board) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        return (board[0][0] == p && board[1][1] == p && board[2][2] == p) ||
               (board[0][2] == p && board[1][1] == p && board[2][0] == p);
    }
}