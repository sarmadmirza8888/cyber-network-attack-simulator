public class Main {
    public static void main(String[] args) {
        // Managers
        NetworkManager networkManager = new NetworkManager();
        QueueManager queueManager = new QueueManager();
        Firewall firewall = new Firewall();
        RollBackManager RollBackManager = new RollBackManager();
        // Devices
        Device pc1 = new Device(
                "PC1",
                "192.168.1.1",
                "PC"
        );
        Device server1 = new Device(
                "Server1",
                "192.168.1.2",
                "SERVER"
        );
        Device router1 = new Device(
                "Router1",
                "192.168.1.3",
                "ROUTER"
        );
        // Add Devices
        networkManager.addDevice(pc1);
        networkManager.addDevice(server1);
        networkManager.addDevice(router1);
        // Connections
        networkManager.addConnection(
                new Connection(pc1, router1, 5)
        );
        networkManager.addConnection(
                new Connection(router1, server1, 3)
        );
        // Save Network State
        NetworkState state =
                new NetworkState(
                        networkManager.getDevices()
                );

        RollBackManager.saveState(state);
        // Normal Packet
        Packet normalPacket =
                new Packet(
                        pc1,
                        server1,
                        "Hello Server",
                        false
                );
        // Malware Packet
        Packet malwarePacket =
                new Packet(
                        pc1,
                        server1,
                        "Virus.exe",
                        true
                );
        // Add To Queue
        queueManager.enqueuePacket(normalPacket);
        queueManager.enqueuePacket(malwarePacket);
        // Process Queue
        while (!queueManager.isEmpty()) {
            Packet currentPacket =
                    queueManager.dequeuePacket();
            if (firewall.inspectPacket(currentPacket)) {
                networkManager.sendPacket(
                        currentPacket
                );
                // Malware Simulation
                if (currentPacket.isInfected()) {
                    currentPacket
                            .getDestination()
                            .infect();
                    System.out.println(
                            "\n"
                                    + currentPacket
                                    .getDestination()
                                    .getDeviceName()
                                    + " has been infected!"
                    );
                }
            }
        }
        // Display Devices
        networkManager.showAllDevices();
        // Display Connections
        networkManager.showConnections();
        // Display Logs
        networkManager.showLogs();
        // Rollback Demo
        RollBackManager.rollback();
    }
}