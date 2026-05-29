public class Main {
    public static void main(String[] args) {
        // =========================
        // CREATE NETWORK MANAGER
        // =========================
        NetworkManager manager = new NetworkManager();
        // =========================
        // CREATE DEVICES
        // =========================
        Device pc1 = new Device(
                "PC1",
                "192.168.1.1",
                "PC"
        );
        Device router1 = new Device(
                "Router1",
                "192.168.1.2",
                "ROUTER"
        );
        Device server1 = new Device(
                "Server1",
                "192.168.1.10",
                "SERVER"
        );
        // =========================
        // ADD DEVICES
        // =========================

        manager.addDevice(pc1);
        manager.addDevice(router1);
        manager.addDevice(server1);

        // =========================
        // CREATE CONNECTIONS
        // =========================

        Connection c1 = new Connection(pc1, router1, 5);

        Connection c2 = new Connection(router1, server1, 10);

        // =========================
        // ADD CONNECTIONS
        // =========================

        manager.addConnection(c1);
        manager.addConnection(c2);

        // =========================
        // CREATE PACKET
        // =========================

        Packet packet1 = new Packet(pc1, server1, "Hello Server", false);

        // =========================
        // SEND PACKET
        // =========================
        manager.sendPacket(packet1);
        // =========================
        // SHOW DEVICES
        // =========================
        manager.showAllDevices();
        // =========================
        // SHOW CONNECTIONS
        // =========================
        manager.showConnections();
        // =========================
        // SHOW NETWORK
        // =========================
        NetworkVisualizer.displayNetwork(manager.getConnections()
        );
        // =========================
        // SHOW LOGS
        // =========================
        manager.showLogs();
    }
}