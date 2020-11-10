package Models;

import Models.PlayerEnums.Position;
import Services.PlayerService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Roster {
    private int teamId;
    LinkedHashMap<Player, Position> roster = new LinkedHashMap<>();

    public Roster(int teamId) {
        this.teamId = teamId;
        populateRoster(teamId);
    }

    public Roster(){};

    public void populateRoster(int teamId){
        PlayerService ps = new PlayerService();
        List<Player> players = ps.getPlayersByTeamId(teamId);
        for(Player player : players){
            roster.put(player, player.getPosition());
        }
    }

    public LinkedHashMap<Player, Position> getRoster() {
        return roster;
    }

    public void setRoster(LinkedHashMap<Player, Position> roster) {
        this.roster = roster;
    }

    public void addToRoster(Player player, Position position) {
        roster.put(player, position);
    }

    public Integer size() {
        return roster.size();
    }

    public String listRoster(Roster roster) {
        return roster.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Player, Position> entry : roster.entrySet()) {
            result.append("\n").append(entry.getValue().toString()).append(" ").append(entry.getKey().getName());}

        return result.toString();
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
