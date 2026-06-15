import java.util.*;
public class NetworkVisualizer {
    public static void displayNetwork(LinkedList<Connection> connections) {
        System.out.println("\n===== NETWORK TOPOLOGY =====");
        if (connections.isEmpty()) {
            System.out.println(
                    "No connections available."
            );
            return;
        }
        for (Connection connection : connections) {
            System.out.println(
                    "[" + connection.getSource().getDeviceName() + "] -----> [" + connection.getDestination().getDeviceName() + "]"
            );
        }
    }

    public void displayNetwork(
            NetworkManager networkManager) {

        System.out.println(
                "\n===== NETWORK VISUALIZATION ====="
        );

        for (Connection connection :
                networkManager.getConnections()) {

            System.out.println(
                    connection.getSource()
                            .getDeviceName()
                            + " ---- "
                            + connection.getDestination()
                            .getDeviceName()
            );
        }
    }
}