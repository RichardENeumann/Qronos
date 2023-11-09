public class Project {
    private String projectName;
    private int timeSpent;
    private Timestamp startingTime;
    private Timestamp stoppingTime;

    public Project(String pName, int tSpent) {
        this.projectName = pName;
        this.timeSpent = tSpent;
    }
    public void setProjectName(String pName) {
        this.projectName = pName;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setTimeSpent(int tSpent) {
        this.timeSpent = tSpent;
    }
    public int getTimeSpent() {
        return timeSpent;
    }
    public void setStartingTime(Timestamp staTime) {
        this.startingTime = staTime;
    }
    public Timestamp getStartingTime() {
        return startingTime;
    }
    public void setStoppingTime(Timestamp stoTime) {
        this.stoppingTime = stoTime;
    }
    public Timestamp getStoppingTime() {
        return stoppingTime;
    }
}