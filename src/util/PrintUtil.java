package util;

import java.util.List;
import java.util.Map;

public class PrintUtil {
    public static void printGrid(int[][] grid) {
        if (grid == null) {
            return;
        }

        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void printGraph(Map<Integer, List<Integer>> graph) {
        if (graph == null) {
            return;
        }

        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
