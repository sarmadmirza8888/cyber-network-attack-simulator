import java.util.ArrayList;
import java.util.HashMap;
public class Graph {
    private ArrayList<Device> devices;
    private HashMap<Device, ArrayList<Device>> adjacencyList;
    // Constructor
    public Graph() {
        devices = new ArrayList<>();
        adjacencyList = new HashMap<>();
    }
    // Add Device (Vertex)
    public void addDevice(Device device) {
        if (!devices.contains(device)) {
            devices.add(device);
            adjacencyList.put(device, new ArrayList<>()
            );
            System.out.println(device.getDeviceName() + " added to graph.");
        }
    }
    // Add Connection (Edge)
    public void addConnection(Device source, Device destination) {
        // Make sure devices exist
        if (!adjacencyList.containsKey(source)
                || !adjacencyList.containsKey(destination)) {
            System.out.println("One or both devices do not exist in graph.");
            return;
        }
        // Undirected Graph
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
        System.out.println("Connection added between " + source.getDeviceName() + " and " + destination.getDeviceName()
        );
    }
    // Display Graph
    public void displayGraph() {
        System.out.println(
                "\n===== NETWORK GRAPH ====="
        );
        for (Device device : devices) {
            System.out.print(device.getDeviceName() + " -> ");
            ArrayList<Device> neighbors = adjacencyList.get(device);
            for (Device neighbor : neighbors) {
                System.out.print(neighbor.getDeviceName() + " ");
            }System.out.println();
        }
    }
    // Getters
    public ArrayList<Device> getDevices() {
        return devices;
    }
    public HashMap<Device,
            ArrayList<Device>> getAdjacencyList() {
        return adjacencyList;
    }
}