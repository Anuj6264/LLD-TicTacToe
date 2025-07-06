import java.util.List;

public abstract class Player {
    private final Symbol symbol;
    private final String name;
    private final PlayerStrategy playerStrategy;

    public Player(Symbol symbol, String name, PlayerStrategy playerStrategy) {
        this.symbol = symbol;
        this.name = name;
        this.playerStrategy = playerStrategy;
    }

    public List<Integer> getNextMove() {
       return playerStrategy.getNextMove();
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }
}
