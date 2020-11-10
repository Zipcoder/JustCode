import Models.Region;
import Models.Team;

import java.util.ArrayList;

public class BracketSelection {
    private Region east;
    private Region west;
    private Region midwest;
    private Region south;
    private Team team1;
    private Team team2;

    public BracketSelection() {
        this.east = new Region("east");
        this.west = new Region("west");
        this.midwest = new Region("midwest");
        this.south = new Region("south");
    }

    public String pickBracketsMessage() {
        return
        "\n" +
        ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")+ "\n" +
        ("         Who Will Win This Matchup?           ")+ "\n" +
        (" -------------------------------------------- ")+ "\n" +
        ("                                              ")+ "\n" +
        ("    1. " + team1 + "                          ")+ "\n" +
        ("    2. " + team2 + "                          ")+ "\n" +
        ("                                              ")+ "\n" +
        ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")+ "\n" +
        (" Enter your input :");
    }

    public void pickFirstRoundWinner(Region region) {
        region.clearPicks();
        ArrayList<Integer> winnerList = new ArrayList<>();
        Team winner = new Team();
        int seedCounter = 16;
        //below creates round 1 matchups
        for(int i = 1; i <=8; i++){
            this.team1 = region.getSeedTeamMap().get(i);
            this.team2 = region.getSeedTeamMap().get(seedCounter);
            Integer userInput = testConsole.getInteger(pickBracketsMessage());
            if (userInput == 1) {
                winner = team1;
                winnerList.add(i);
            } else {
                winner = team2;
                winnerList.add(i);
            }
            seedCounter--;
        }
        region.setPicks(winnerList);
    }

    public void pickSecondRoundWinner(Region region){
        ArrayList<Integer> winnerList = new ArrayList<>();
        Team winner = new Team();
        int seedCounter = 8;
        for (int i = 1; i<=4;i++){
            this.team1 = region.getSeedTeamMap().get(region.getPicks().get(i));
            this.team2 = region.getSeedTeamMap().get(region.getPicks().get(seedCounter));
            Integer userInput = testConsole.getInteger(pickBracketsMessage());
            if (userInput == 1) {
                winner = team1;
                winnerList.add(i);
            } else {
                winner = team2;
                winnerList.add(i);
            }
            seedCounter--;
        }
        region.setPicks(winnerList);
    }

    public void pickThirdRoundWinner(Region region){
    ArrayList<Integer> winnerList = new ArrayList<>();
    Team winner = new Team();
    int seedCounter = 4;
        for (int i = 1; i<=2;i++){
        this.team1 = region.getSeedTeamMap().get(region.getPicks().get(i));
        this.team2 = region.getSeedTeamMap().get(region.getPicks().get(seedCounter));
        Integer userInput = testConsole.getInteger(pickBracketsMessage());
        if (userInput == 1) {
            winner = team1;
            winnerList.add(i);
        } else {
            winner = team2;
            winnerList.add(i);
        }
        seedCounter--;
    }
        region.setPicks(winnerList);
}

    public void pickFourthRoundWinner(Region region){
        Team winner = new Team();
        this.team1 = region.getSeedTeamMap().get(region.getPicks().get(1));
        this.team2 = region.getSeedTeamMap().get(region.getPicks().get(2));
        Integer userInput = testConsole.getInteger(pickBracketsMessage());
        if (userInput == 1) {
            winner = team1;
            region.setChamp(team1);
        } else {
                winner = team2;
                region.setChamp(team2);
            }
    }

    public void pickRegionWinner(Region region){
        pickFirstRoundWinner(region);
        pickSecondRoundWinner(region);
        pickThirdRoundWinner(region);
        pickFourthRoundWinner(region);}

    public static void main(String[] args) {
        // selectedRegion will be either pulled from user input or we can hardcode it

        BracketSelection bs = new BracketSelection();
        bs.pickRegionWinner(bs.east);
        bs.pickRegionWinner(bs.west);
        bs.pickRegionWinner(bs.midwest);
        bs.pickRegionWinner(bs.south);
    }

}