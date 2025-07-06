import java.util.List;

public class HumanStrategy implements PlayerStrategy {
    
    @Override
    public List<Integer> getNextMove() {
        System.out.println("Enter row number: ");
        int row = Integer.parseInt(System.console().readLine());
        System.out.println("Enter coloumn number: ");
        int col = Integer.parseInt(System.console().readLine());
        return List.of(row, col);
    }
}
