import util.PrintUtil;
import util.TestData;

public class Main {
    public static void main(String[] args) {
      //  PrintUtil.printGraph(BreadthFirstSearch.bfs(TestData.graph, 0));

        PrintUtil.printGrid(BreadthFirstSearch.bfs(TestData.grid4x3));

    }
}