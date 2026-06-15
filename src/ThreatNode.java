public class ThreatNode {

    private Threat threat;

    private ThreatNode left;
    private ThreatNode right;

    // Constructor
    public ThreatNode(Threat threat) {

        this.threat = threat;
        this.left = null;
        this.right = null;
    }

    // Getters
    public Threat getThreat() {
        return threat;
    }

    public ThreatNode getLeft() {
        return left;
    }

    public ThreatNode getRight() {
        return right;
    }

    // Setters
    public void setThreat(Threat threat) {
        this.threat = threat;
    }

    public void setLeft(ThreatNode left) {
        this.left = left;
    }

    public void setRight(ThreatNode right) {
        this.right = right;
    }
}