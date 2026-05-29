public class Device {
    private String deviceName;
    private String ipAddress;
    private String deviceType;
    private boolean infected;
    private boolean firewallEnabled;
    private boolean active;

    public Device(String deviceName, String ipAddress, String deviceType) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.deviceType = deviceType;
        this.infected = false;
        this.firewallEnabled = false;
        this.active = true;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public String getDeviceType() {
        return deviceType;
    }
    public boolean isInfected() {
        return infected;
    }
    public boolean isFirewallEnabled() {
        return firewallEnabled;
    }
    public boolean isActive() {
        return active;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public void setInfected(boolean infected) {
        this.infected = infected;
    }
    public void setFirewallEnabled(boolean firewallEnabled) {
        this.firewallEnabled = firewallEnabled;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void infect() {
        infected = true;
    }
    public void clean() {
        infected = false;
    }
    public void enableFirewall() {
        firewallEnabled = true;
    }
    public void disableFirewall() {
        firewallEnabled = false;
    }
    @Override
    public String toString() {
        return "\n===== DEVICE INFO =====" + "\nName: " + deviceName + "\nIP Address: " + ipAddress + "\nDevice Type: " + deviceType + "\nInfected: " + infected + "\nFirewall Enabled: " + firewallEnabled + "\nActive: " + active;
    }
}
