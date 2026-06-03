import java.util.ArrayList;
public class NetworkState {
    private ArrayList<Device> savedDevices;
    // Constructor
    public NetworkState(ArrayList<Device> savedDevices) {
        this.savedDevices = savedDevices;
    }
    // Getter
    public ArrayList<Device> getSavedDevices() {
        return savedDevices;
    }
    // Setter
    public void setSavedDevices(
            ArrayList<Device> savedDevices) {
        this.savedDevices = savedDevices;
    }
    @Override
    public String toString() {
        return "\n===== NETWORK STATE =====" +
                "\nSaved Devices: "
                + savedDevices.size();
    }
}