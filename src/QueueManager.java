import java.util.LinkedList;
import java.util.Queue;
public class QueueManager {
    private Queue<Packet> packetQueue;
    // Constructor
    public QueueManager() {
        packetQueue = new LinkedList<>();
    }
    // Add packet to queue
    public void enqueuePacket(Packet packet) {
        packetQueue.offer(packet);

        System.out.println(
                "\nPacket Added To Queue Successfully."
        );
    }
    // Remove packet from queue
    public Packet dequeuePacket() {
        if (packetQueue.isEmpty()) {
            System.out.println(
                    "\nQueue Is Empty."
            );
            return null;
        }
        return packetQueue.poll();
    }
    // View first packet without removing
    public Packet peekPacket() {

        if (packetQueue.isEmpty()) {

            System.out.println(
                    "\nQueue Is Empty."
            );

            return null;
        }

        return packetQueue.peek();
    }
    // Check if queue is empty
    public boolean isEmpty() {
        return packetQueue.isEmpty();
    }
    // Get queue size
    public int size() {
        return packetQueue.size();
    }
    // Display all packets
    public void displayQueue(){
        System.out.println(
                "\n===== PACKET QUEUE ====="
        );
        if (packetQueue.isEmpty()) {
            System.out.println(
                    "No Packets In Queue."
            );
            return;
        }
        for (Packet packet : packetQueue) {
            System.out.println(packet);
            System.out.println(
                    "----------------------"
            );
        }
    }
    // Clear queue
    public void clearQueue() {
        packetQueue.clear();

        System.out.println(
                "\nQueue Cleared Successfully."
        );
    }
}