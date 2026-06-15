import java.util.ArrayList;
import java.util.LinkedList;
public class NetworkManager {
    private ArrayList<Device> devices;
    private LinkedList<Connection> connections;
    private ActivityLog logger;
    public NetworkManager() {
        devices = new ArrayList<>();
        connections = new LinkedList<>();
        logger = new ActivityLog();
    }
    public void addDevice(Device device) {
        devices.add(device);
        logger.addLog("Device Added: " + device.getDeviceName());
    }
    public void showAllDevices() {
        System.out.println(
                "\n===== NETWORK DEVICES ====="
        );
        if (devices.isEmpty()) {
            System.out.println(
                    "No devices available."
            );
            return;
        }
        for (Device device : devices) {
            System.out.println(device);
        }
    }
    public Device findDeviceByName(String name) {
        for (Device device : devices) {
            if (device.getDeviceName()
                    .equalsIgnoreCase(name)) {
                return device;
            }
        }
        return null;
    }
    public void addConnection(Connection connection) {
        connections.add(connection);
        logger.addLog("Connection Added Between "
                + connection.getSource()
                .getDeviceName()
                + " and "
                + connection.getDestination().getDeviceName()
        );
    }
    public void showConnections() {
        System.out.println(
                "\n===== NETWORK CONNECTIONS ====="
        );
        if (connections.isEmpty()) {
            System.out.println(
                    "No connections available."
            );
            return;
        }
        for (Connection connection : connections) {
            System.out.println(connection);
        }
    }
    public void sendPacket(Packet packet) {
        logger.addLog("Packet Sent From "
                + packet.getSource()
                .getDeviceName()
                + " To "
                + packet.getDestination()
                .getDeviceName()
        );
        System.out.println(packet);
    }public void showLogs() {
        logger.showLogs();
    }
    public ArrayList<Device> getDevices() {
        return devices;
    }
    public LinkedList<Connection> getConnections() {
        return connections;
    }
    public ActivityLog getLogger() {
        return logger;
    }
}