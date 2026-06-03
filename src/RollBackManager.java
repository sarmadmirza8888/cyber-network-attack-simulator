import java.util.Stack;
public class RollBackManager {
    private Stack<NetworkState> savedStates;
    // Constructor
    public RollBackManager() {
        savedStates = new Stack<>();
    }
    // Save current network state
    public void saveState(NetworkState state) {
        savedStates.push(state);
        System.out.println(
                "\nNetwork State Saved Successfully."
        );
    }
    // Restore latest saved state
    public NetworkState rollback() {
        if (savedStates.isEmpty()) {
            System.out.println(
                    "\nNo Saved States Available."
            );
            return null;
        }
        System.out.println(
                "\nRollback Completed."
        );
        return savedStates.pop();
    }
    // Check if stack contains states
    public boolean hasStates() {
        return !savedStates.isEmpty();
    }
    // Display saved states count
    public void displaySavedStates() {
        System.out.println(
                "\nTotal Saved States: "
                        + savedStates.size()
        );
    }
    // Getter
    public Stack<NetworkState> getSavedStates() {
        return savedStates;
    }
}