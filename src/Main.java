public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("CYBER ATTACK NETWORK SIMULATOR");
        System.out.println("=================================");

        // =====================================================
        // MANAGERS
        // =====================================================

        NetworkManager networkManager =
                new NetworkManager();

        QueueManager queueManager =
                new QueueManager();

        Firewall firewall =
                new Firewall();

        RollBackManager rollbackManager =
                new RollBackManager();
        Graph graph = new Graph();
        ThreatTree threatTree = new ThreatTree();
        MalwareSimulator malwareSimulator = new MalwareSimulator();
        // =====================================================
        // DEVICES
        // =====================================================
        Device pc1 = new Device("PC1", "192.168.1.10", "Computer");
        Device router1 = new Device("Router1", "192.168.1.1", "Router");
        Device server1 = new Device("Server1", "192.168.1.100", "Server");
        Device firewallDevice = new Device("Firewall1", "192.168.1.254", "Firewall");
        // =====================================================
        // ADD DEVICES
        // =====================================================
        networkManager.addDevice(pc1);
        networkManager.addDevice(router1);
        networkManager.addDevice(server1);
        networkManager.addDevice(firewallDevice);
        networkManager.showAllDevices();
        // =====================================================
        // CONNECTIONS
        // =====================================================
        Connection c1 = new Connection(pc1, router1, 5);
        Connection c2 = new Connection(router1, server1, 3);
        Connection c3 = new Connection(server1, firewallDevice, 2);
        networkManager.addConnection(c1);
        networkManager.addConnection(c2);
        networkManager.addConnection(c3);
        networkManager.showConnections();
        // =====================================================
        // SAVE NETWORK STATE
        // =====================================================
        NetworkState state = new NetworkState(networkManager.getDevices()
                );
        rollbackManager.saveState(state);
        // =====================================================
        // GRAPH
        // =====================================================
        graph.addDevice(pc1);
        graph.addDevice(router1);
        graph.addDevice(server1);
        graph.addDevice(firewallDevice);
        graph.addConnection(pc1, router1);
        graph.addConnection(router1, server1);
        graph.addConnection(server1, firewallDevice);
        graph.displayGraph();
        // =====================================================
        // THREATS (BST)
        // =====================================================
        Threat t1 = new Threat("Trojan", 8, "Steals user data");
        Threat t2 = new Threat("Spyware", 4, "Monitors activity");
        Threat t3 = new Threat("Ransomware", 10, "Encrypts files");
        Threat t4 = new Threat("Worm", 6, "Self-spreading malware");
        threatTree.insertThreat(t1);
        threatTree.insertThreat(t2);
        threatTree.insertThreat(t3);
        threatTree.insertThreat(t4);

        threatTree.displayThreats();

        // =====================================================
        // PACKETS
        // =====================================================

        Packet normalPacket =
                new Packet(
                        pc1,
                        server1,
                        "Hello Server",
                        false
                );

        Packet malwarePacket =
                new Packet(
                        pc1,
                        server1,
                        "Virus.exe",
                        true
                );

        queueManager.enqueuePacket(normalPacket);
        queueManager.enqueuePacket(malwarePacket);

        queueManager.displayQueue();

        // =====================================================
        // PROCESS QUEUE
        // =====================================================

        while (!queueManager.isEmpty()) {

            Packet currentPacket =
                    queueManager.dequeuePacket();

            if (firewall.inspectPacket(currentPacket)) {

                networkManager.sendPacket(
                        currentPacket
                );
            }
        }
        // =====================================================
        // BFS
        // =====================================================
        Bfs bfs = new Bfs();
        bfs.traverse(
                graph,
                pc1
        );
        // =====================================================
        // DFS
        // =====================================================
        Dfs dfs = new Dfs();
        dfs.traverse(
                graph,
                pc1
        );
        // =====================================================
        // DIJKSTRA
        // =====================================================
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(graph, pc1
        );
        // =====================================================
        // MALWARE SIMULATION
        // =====================================================
        malwareSimulator.spreadMalware(graph, pc1);
        // =====================================================
        // LOGS
        // =====================================================
        networkManager.showLogs();
        // =====================================================
        // ROLLBACK
        // =====================================================
        rollbackManager.displaySavedStates();
        rollbackManager.rollback();
        rollbackManager.displaySavedStates();
        // =====================================================
        // VISUALIZER
        // =====================================================
        NetworkVisualizer visualizer = new NetworkVisualizer();
        visualizer.displayNetwork(networkManager);
        System.out.println(
                "\nSimulation Completed Successfully."
        );
    }
}