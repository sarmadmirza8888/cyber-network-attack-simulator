public class Connection {
    private Device source;
    private Device destination;
    private int weight;
    private boolean active;
    public Connection(Device source, Device destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.active = true;
    }
    public Device getSource() {
        return source;
    }
    public Device getDestination() {
        return destination;
    }
    public int getWeight() {
        return weight;
    }
    public boolean isActive() {
        return active;
    }
    public void setSource(Device source) {
        this.source = source;
    }
    public void setDestination(Device destination) {
        this.destination = destination;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    @Override
    public String toString() {
        return "\n===== CONNECTION INFO =====" +
                "\nSource: " + source.getDeviceName() +
                "\nDestination: " + destination.getDeviceName() +
                "\nWeight: " + weight +
                "\nActive: " + active;
    }
}

