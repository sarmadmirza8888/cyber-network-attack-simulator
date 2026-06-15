import java.util.*;
public class Dijkstra {
    public void shortestPath(Graph graph, Device source) {
        HashMap<Device, Integer> distance = new HashMap<>();
        PriorityQueue<DeviceDistance> pq = new PriorityQueue<>();
        for (Device device : graph.getDevices()) {
            distance.put(device, Integer.MAX_VALUE
            );
        }
        distance.put(source, 0);
        pq.offer(new DeviceDistance(source, 0
                )
        );
        while (!pq.isEmpty()) {
            DeviceDistance current =
                    pq.poll();
            Device currentDevice =
                    current.getDevice();
            int currentDistance =
                    current.getDistance();
            ArrayList<Device> neighbors = graph.getAdjacencyList().get(currentDevice);
            for (Device neighbor : neighbors) {
                int newDistance = currentDistance + 1;
                if (newDistance < distance.get(neighbor)) {
                    distance.put(neighbor, newDistance);
                    pq.offer(new DeviceDistance(neighbor, newDistance)
                    );
                }
            }
        }
        System.out.println("\n===== SHORTEST PATHS ====="
        );
        for (Device device : distance.keySet()) {
            System.out.println(source.getDeviceName() + " -> " + device.getDeviceName() + " = " + distance.get(device)
            );
        }
    }
}