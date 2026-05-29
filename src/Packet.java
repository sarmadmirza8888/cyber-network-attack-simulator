public class Packet {
    private Device source;
    private Device destination;
    private String payload;
    private boolean infected;
    public Packet(Device source, Device destination, String payload, boolean infected) {
        this.source = source;
        this.destination = destination;
        this.payload = payload;
        this.infected = infected;
    }
    public Device getSource() {
        return source;
    }
    public Device getDestination() {
        return destination;
    }
    public String getPayload() {
        return payload;
    }
    public boolean isInfected() {
        return infected;
    }
    public void setSource(Device source) {
        this.source = source;
    }
    public void setDestination(Device destination) {
        this.destination = destination;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public void setInfected(boolean infected) {
        this.infected = infected;
    }
    @Override
    public String toString() {
        return "\n===== PACKET INFO =====" + "\nSource: " + source.getDeviceName() + "\nDestination: " + destination.getDeviceName() + "\nPayload: " + payload + "\nInfected Packet: " + infected;
    }
}

