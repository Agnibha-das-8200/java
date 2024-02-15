import java.util.Scanner;
public class TicTacToe
 {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    public static void main(String[] args)
    {
        initializeBoard();
        boolean gameWon = false;
        while (!gameWon) 
        {
            displayBoard();
            playTurn();
            gameWon = checkWin();
            if (gameWon)
            {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
            } else if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }
            togglePlayer();
        }
    }
    private static void initializeBoard() 
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                board[i][j] = ' ';
            }
        }
    }
    private static void displayBoard() 
    {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }
    private static void playTurn()
    {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do 
        {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(row, col));

        board[row][col] = currentPlayer;
    }
    private static boolean isValidMove(int row, int col) 
    {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') 
        {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        return true;
    }
    private static void togglePlayer() 
    {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    private static boolean checkWin()
    {
        for (int i = 0; i < 3; i++) 
        {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) 
            {
                return true; 
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) 
            {
                return true; 
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) 
        {
            return true; 
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) 
        {
            return true; 
        }
        return false;
    }
    private static boolean isBoardFull() 
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (board[i][j] == ' ')
                {
                    return false; 
                }
            }
        }
        return true; 
    }
}