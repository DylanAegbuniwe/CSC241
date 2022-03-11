/**
 *
 * @author dylan
 */
public class GoGame {
    private static boolean liberty = false;
    private static String[][] BOARD = {
            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
            {"-1", "-1", "-1", "-1", "-1", "0", "-1", "-1"},
            {"-1", "-1", "-1", "-1", "0", "1", "-1", "-1"},
            {"-1", "-1", "-1", "0", "1", "1", "0", "-1"},
            {"-1", "-1", "-1", "-1", "-1", "0", "0", "-1"},
            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
            
    };

    public static void main(String[] args) {
        findLiberty(BOARD);
        System.out.println(liberty);
    }
    public static void findLiberty(String[][] BOARD)
    {
        int checker = 1;
        dfs(BOARD, 0, 0);

    }

    public static void dfs(String[][] BOARD, int i, int j)
    {

            if(i - 1 >= 0 && !isVisited(BOARD, i-1, j)) dfs(BOARD, i-1, j);
            if(i + 1 <= 4 && !isVisited(BOARD, i+1, j)) dfs(BOARD, i+1, j);
            if(j - 1 >= 0 && !isVisited(BOARD, i, j-1)) dfs(BOARD, i, j-1);
            if(j + 1 <= 4 && !isVisited(BOARD, i, j+1)) dfs(BOARD, i, j+1);
            liberty = true;
    }
        
    
    public static boolean isVisited(String[][] BOARD, int i, int j)
    {
        return BOARD[i][j].equals("#");
    }
}