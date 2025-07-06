import java.util.List;

public class TicTacToeGame {
    public Board board;
    public Player player1, player2;
    public Player currentPlayer;

    public TicTacToeGame(int rows, int cols, Player player1, Player player2) {
        this.board = new Board(rows, cols);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        while (true) { 
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s Turn");
            System.out.println();
            List<Integer> move = currentPlayer.getNextMove();
            int row = move.get(0);
            int col = move.get(1);
            while(!board.isValidMove(row, col)) {
                System.out.println("----------Make Valid Move----------");
                move = currentPlayer.getNextMove();
                row = move.get(0);
                col = move.get(1);
            }
            board.makeMove(row, col, currentPlayer.getSymbol());
            if(board.checkWinning(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " Wins!!!!!!!!!!!!!!");
                break;
            }  
            else if(board.checkDraw()) {
                board.printBoard();
                System.out.println("It's a Draw!");
                break;
            }
            switchPlayer();
        }
    }

    public void switchPlayer() {
        if(currentPlayer == player1)
            currentPlayer = player2;
        else
            currentPlayer = player1;
    }
}
