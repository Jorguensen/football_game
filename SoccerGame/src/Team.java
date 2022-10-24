public class Team {
    private String teamName;
    private Player []players;
    private int points;

    private int goals;


    public Team (String teamName, Player[] players){
       this.teamName = teamName;
       this.players=players;
    }


    public Player[] getPlayers() {
        return players;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        System.out.println(points + " TEAM POINTS");
      return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int numberOfGoals) {
        this.goals = numberOfGoals;
    }

}
