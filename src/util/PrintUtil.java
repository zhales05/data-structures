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

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println("Printing tree:");
        printTree(root, 0);
    }

    private static void printTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        printTree(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + root.val);
        } else {
            System.out.println(root.val);
        }
        printTree(root.left, level + 1);
    }
}
