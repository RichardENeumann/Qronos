public class Project {
    private String projectName;
    private short timeSpent;
    private Timestamp startingTime;
    private Timestamp stoppingTime;

    public Project(String pName, short tSpent) {
        this.projectName = pName;
        this.timeSpent = tSpent;
    }
    public void setProjectName(String pName) {
        this.projectName = pName;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setTimeSpent(short tSpent) {
        this.timeSpent = tSpent;
    }
    public short getTimeSpent() {
        return timeSpent;
    }
    public void setStartingTime(Timestamp saTime) {
        this.startingTime = saTime;
    }
    public Timestamp getStartingTime() {
        return startingTime;
    }
    public void setStoppingTime(Timestamp soTime) {
        this.stoppingTime = soTime;
    }
    public Timestamp getStoppingTime() {
        return stoppingTime;
    }
}