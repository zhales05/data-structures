import java.util.*;

public class BreadthFirstSearch {


    public static int[][] bfs(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        //coordinates of the position in the grid
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        int[][] directions = {{-1,0}, {1, 0}, {0, -1}, {0, 1}};

        queue.offer(new int[]{0,0});
        visited[0][0] = true;

        System.out.println("Visiting nodes in BFS order:");

        while(!queue.isEmpty()) {
            int[] val = queue.poll();
            int row = val[0];
            int col = val[1];

            System.out.println("Visited node: (" + row + ", " + col + ")");

            //try all the direction
            for(int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow >= 0 && newRow < rows && newCol >=0 && newCol < cols && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
        return null;
    }

    public static Map<Integer, List<Integer>> bfs(Map<Integer, List<Integer>> graph, int startNode) {
        Map<Integer, List<Integer>> result = new HashMap<>();
        // visited will keep track of the nodes we have been to so we don't hit them again
        //it can be a set because each node it unique even if the value is the same (the key is not)
        Set<Integer> visited = new HashSet<>();
        //Will keep track of where we will go next
        Queue<Integer> queue = new LinkedList<>();

        //load up the queue
        queue.add(startNode);
        visited.add(startNode);

        while(!queue.isEmpty()) {
            //grab the next one of the queue
            int currentNode = queue.poll();
            System.out.println("Visited node: " + currentNode);

            for(int neighbor : graph.get(currentNode)) {
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    //now that visited is in the queue we want to make sure it doesn't get added again
                    visited.add(neighbor);
                }
            }
        }
        return null;
    }
}
