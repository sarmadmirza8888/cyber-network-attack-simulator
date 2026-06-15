public class Threat {

    private String threatName;
    private int severityLevel;
    private String description;

    // Constructor
    public Threat(String threatName,
                  int severityLevel,
                  String description) {

        this.threatName = threatName;
        this.severityLevel = severityLevel;
        this.description = description;
    }

    // Getters
    public String getThreatName() {
        return threatName;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setThreatName(String threatName) {
        this.threatName = threatName;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        return "\nThreat Name : " + threatName +
                "\nSeverity    : " + severityLevel +
                "\nDescription : " + description;
    }
}