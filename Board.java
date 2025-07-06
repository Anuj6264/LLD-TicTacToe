public class Board {
    private final int rows;
    private final int cols;
    private final Symbol[][] grid;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Symbol[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean isValidMove(int row, int col) {
        return row < rows && col < cols && row >= 0 && col >=0 && grid[row][col] == Symbol.EMPTY;
    }

    public void makeMove(int row, int col, Symbol symbol) {
        grid[row][col] = symbol;
    }

    public boolean checkWinning(Symbol symbol) {
        //Check all rows
        for(int i = 0; i < rows; i++) {
            boolean flag = true;
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] != symbol) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;
        }

        //Check all cols
        for(int i = 0; i < cols; i++) {
            boolean flag = true;
            for(int j = 0; j < rows; j++) {
                if(grid[j][i] != symbol) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;
        }

        //Check left diagonal
        boolean flag = true;
        for(int i = 0; i < rows; i++) {
            if(grid[i][i] != symbol) {
                flag = false;
                break;
            }
        }
        if(flag)
            return true;

        //Check right diagonal
        flag = true;
        for(int i = 0; i < rows; i++) {
            if(grid[i][rows - i - 1] != symbol) {
                flag = false;
                break;
            }
        }
        if(flag)
            return true;
        return flag;
    }

    public boolean checkDraw() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == Symbol.EMPTY)
                    return false;
            }
        }
        return true;
    }

    public void printBoard() {
        System.out.println("------------Printing Board----------------");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] != Symbol.EMPTY)
                    System.out.print(grid[i][j].getValue() + " ");
                else
                    System.out.print("- ");
                if(j < cols - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}
