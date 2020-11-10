package Models;

public class Team {
    private String teamName;
    private Roster teamRoster;
    private String records;
    private String projections;
    private String history;
    private String schedule;


    public Team(String teamName, String records,String projections,String history,String schedule, Roster roster){
        this.teamName = teamName;
        this.teamRoster = new Roster();
        this.records = records;
        this.projections = projections;
        this.history = history;
        this.schedule = schedule;

    }

    public Team(){}

    public Roster getTeamRoster() {
        return teamRoster;
    }

    public void setTeamRoster(Roster teamRoster) {
        this.teamRoster = teamRoster;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getProjections() {
        return projections;
    }

    public void setProjections(String projections) {
        this.projections = projections;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

//    get roster from API
//    records;
//    projections;
//    history;
//    schedule;


}
