import java.util.ArrayList;
import java.util.HashSet;
public class Dfs {
    private HashSet<Device> visited;
    public Dfs() {
        visited = new HashSet<>();
    }
    public void traverse(Graph graph, Device startDevice) {
        System.out.println(
                "\n===== DFS Traversal ====="
        );
        dfsRecursive(graph, startDevice);
    }
    private void dfsRecursive(Graph graph, Device current) {
        visited.add(current);
        System.out.println(current.getDeviceName());
        ArrayList<Device> neighbors = graph.getAdjacencyList().get(current);
        for (Device neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(graph, neighbor);
            }
        }
    }
}