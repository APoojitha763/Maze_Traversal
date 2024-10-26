package mazeSolver;
public class MazeSolver {
    public static void main(String[] args) {
        char[][] maze = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
                {'#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };
        mazeTraversal(maze, 1, 1);  
    }
    public static void mazeTraversal(char[][] maze, int row, int col) {
        if (maze[row][col] == '.' || maze[row][col] == 's') {      
            maze[row][col] = 'x';            
            displayMaze(maze);
            if (row == maze.length - 2 && col == maze[0].length - 2) {
                System.out.println("Maze solved!");
                return;
            }
            mazeTraversal(maze, row + 1, col);  
            mazeTraversal(maze, row, col + 1);  
            mazeTraversal(maze, row - 1, col);  
            mazeTraversal(maze, row, col - 1);  
            maze[row][col] = '.';  
        }
    }
    public static void displayMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
