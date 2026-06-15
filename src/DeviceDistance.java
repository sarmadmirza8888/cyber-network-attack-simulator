public class DeviceDistance implements Comparable<DeviceDistance> {
    private Device device;
    private int distance;
    public DeviceDistance(
            Device device,
            int distance) {
        this.device = device;
        this.distance = distance;
    }
    public Device getDevice() {
        return device;
    }
    public int getDistance() {
        return distance;
    }
    @Override
    public int compareTo(DeviceDistance other) {
        return Integer.compare(this.distance, other.distance
        );
    }
}