import java.util.LinkedList;
public class ActivityLog {

    private LinkedList<String> logs;

    public ActivityLog() {
        logs = new LinkedList<>();
    }
    public void addLog(String message) {
        logs.add(message);
    }
    public void showLogs() {
        System.out.println("\n===== ACTIVITY LOGS =====");
        if (logs.isEmpty()) {
            System.out.println("No logs available.");
            return;
        }
        for (int i = 0; i < logs.size(); i++) {
            System.out.println((i + 1) + ". " + logs.get(i)
            );
        }
    }
    public void clearLogs() {
        logs.clear();
    }
    public LinkedList<String> getLogs() {
        return logs;
    }
}
