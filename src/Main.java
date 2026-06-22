import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NetworkManager networkManager = new NetworkManager();
        Graph graph = new Graph();
        QueueManager queueManager = new QueueManager();
        Firewall firewall = new Firewall();
        ThreatTree threatTree = new ThreatTree();
        MalwareSimulator malwareSimulator = new MalwareSimulator();
        Bfs bfs = new Bfs();
        Dfs dfs = new Dfs();
        Dijkstra dijkstra = new Dijkstra();
        boolean running = true;
        while(running) {
            System.out.println(
                    "\n===== CYBER ATTACK NETWORK SIMULATOR ====="
            );
            System.out.println("1. Add Device");
            System.out.println("2. Show Devices");
            System.out.println("3. Connect Devices");
            System.out.println("4. Show Connections");
            System.out.println("5. Create Packet");
            System.out.println("6. Process Packet Queue");
            System.out.println("7. Run BFS");
            System.out.println("8. Run DFS");
            System.out.println("9. Run Dijkstra");
            System.out.println("10. Malware Simulation");
            System.out.println("11. Add Threat");
            System.out.println("12. Show Threat Rankings");
            System.out.println("13. Show Logs");
            System.out.println("14. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Device Name: "
                    );
                    String name = input.nextLine();
                    System.out.print(
                            "IP Address: "
                    );
                    String ip = input.nextLine();
                    System.out.print(
                            "Type: "
                    );

                    String type = input.nextLine();
                    Device device = new Device(name, ip, type);
                    networkManager.addDevice(device);
                    graph.addDevice(device);
                    break;
                case 2:
                    networkManager.showAllDevices();
                    break;
                case 3:
                    System.out.print("Source Device: ");
                    String sourceName = input.nextLine();
                    System.out.print("Destination Device: ");
                    String destinationName = input.nextLine();
                    Device source = networkManager.findDeviceByName(sourceName);
                    Device destination = networkManager.findDeviceByName(destinationName);
                    if(source != null && destination != null) {
                        Connection connection = new Connection(source, destination, 1);
                        networkManager.addConnection(connection);
                        graph.addConnection(source, destination);
                    }
                    break;
                case 4:
                    networkManager.showConnections();
                    break;
                case 5:
                    System.out.print("Source Device: ");
                    sourceName = input.nextLine();
                    System.out.print("Destination Device: ");
                    destinationName =input.nextLine();
                    source = networkManager.findDeviceByName(sourceName);
                    destination = networkManager.findDeviceByName(destinationName);
                    System.out.print("Payload: ");
                    String payload = input.nextLine();
                    Packet packet = new Packet(source, destination, payload, false);
                    queueManager.enqueuePacket(packet
                    );
                    break;
                case 6:
                    if(!queueManager.isEmpty()) {

                        Packet current = queueManager.dequeuePacket();

                        if(firewall.inspectPacket(
                                current
                        )) {

                            networkManager.sendPacket(current
                            );
                        }
                    }
                    break;
                case 7:
                    System.out.print(
                            "Start Device: ");
                    String bfsStart = input.nextLine();
                    Device bfsDevice = networkManager.findDeviceByName(bfsStart);
                    bfs.traverse(graph, bfsDevice);
                    break;
                case 8:
                    System.out.print("Start Device: ");
                    String dfsStart = input.nextLine();
                    Device dfsDevice = networkManager.findDeviceByName(dfsStart);
                    dfs.traverse(graph, dfsDevice);
                    break;
                case 9:
                    System.out.print("Source Device: ");
                    String dijkstraStart = input.nextLine();
                    Device dijkstraDevice = networkManager.findDeviceByName(dijkstraStart);
                    dijkstra.shortestPath(graph, dijkstraDevice);
                    break;
                case 10:
                    System.out.print("Infected Device: ");
                    String infectedName = input.nextLine();
                    Device infected = networkManager.findDeviceByName(infectedName);
                    malwareSimulator.spreadMalware(graph, infected
                    );
                    break;
                case 11:
                    System.out.print("Threat Name: ");
                    String threatName = input.nextLine();
                    System.out.print("Severity: "
                    );
                    int severity = input.nextInt();
                    input.nextLine();
                    System.out.print("Description: "
                    );
                    String description = input.nextLine();
                    threatTree.insertThreat(new Threat(threatName, severity, description
                            )
                    );
                    break;
                case 12:
                    threatTree.displayThreats();
                    break;
                case 13:
                    networkManager.showLogs();
                    break;
                case 14:
                    running = false;
                    System.out.println("Simulation Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}