public class ThreatTree {
    private ThreatNode root;
    // Constructor
    public ThreatTree() {
        root = null;
    }
    // Public Insert Method
    public void insertThreat(Threat threat) {
        root = insertRecursive(root, threat);
    }
    // Recursive Insert
    private ThreatNode insertRecursive(ThreatNode current, Threat threat) {
        if (current == null) {
            return new ThreatNode(threat);
        }
        if (threat.getSeverityLevel() < current.getThreat().getSeverityLevel()) {
            current.setLeft(insertRecursive(current.getLeft(), threat)
            );
        }
        else {
            current.setRight(insertRecursive(current.getRight(), threat
                    )
            );
        }
        return current;
    }
    // Search Threat By Severity
    public Threat searchThreat(int severity) {
        ThreatNode result = searchRecursive(root, severity);
        if (result == null) {
            return null;
        }
        return result.getThreat();
    }
    private ThreatNode searchRecursive(ThreatNode current, int severity) {
        if (current == null) {
            return null;
        }
        if (current.getThreat().getSeverityLevel() == severity) {
            return current;
        }
        if (severity < current.getThreat().getSeverityLevel()) {
            return searchRecursive(current.getLeft(), severity
            );
        }return searchRecursive(current.getRight(), severity
        );
    }
    public void displayThreats() {
        System.out.println("\n===== THREAT RANKINGS =====");
        inorderTraversal(root);
    }
    private void inorderTraversal(ThreatNode current) {
        if (current == null) {return;}
        inorderTraversal(current.getLeft());
        System.out.println(current.getThreat());
        inorderTraversal(current.getRight());
    }
}