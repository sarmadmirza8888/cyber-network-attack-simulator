import java.util.*;
public class Bfs {
    public void traverse(Graph graph, Device startDevice) {
        Queue<Device> queue = new LinkedList<>();
        HashSet<Device> visited = new HashSet<>();
        queue.offer(startDevice);
        visited.add(startDevice);
        System.out.println("\n===== BFS Traversal =====");
        while (!queue.isEmpty()) {
            Device current = queue.poll();
            System.out.println(current.getDeviceName());
            ArrayList<Device> neighbors = graph.getAdjacencyList().get(current);
            for (Device neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}