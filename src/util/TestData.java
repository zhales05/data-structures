package util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestData {
    public static int[][] grid4x4 = {
            {1, 1, 0, 0},
            {1, 0, 1, 1},
            {0, 1, 1, 0},
            {0, 0, 0, 1}
    };

    public static int[][] grid4x3 = {
            {1, 1, 0, 0},
            {1, 0, 1, 1},
            {0, 1, 1, 0}
    };

    public static Map<Integer, List<Integer>> graph = new HashMap<>();
    static {
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));
    }
}
