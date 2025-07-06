public class Main {
    public static void main(String[] args) {
        Player player1 = PlayerFactory.createPlayer("Anuj", "Human", Symbol.O);
        Player player2 = PlayerFactory.createPlayer("Mradul", "Human", Symbol.X);
        TicTacToeGame ticTacToeGame = new TicTacToeGame(3, 3, player1, player2);
        ticTacToeGame.play();
    }
}
