public class PlayerFactory {
    public static Player createPlayer(String name, String type, Symbol symbol) {
        if(type.equals( "Human"))
            return new HumanPlayer(symbol, name, new HumanStrategy());
        else if(type.equals("Bot"))
            return new BotPlayer(symbol, name, new BotStrategy());
        else
            throw new IllegalArgumentException("Invalid Player Type");
    }
}
