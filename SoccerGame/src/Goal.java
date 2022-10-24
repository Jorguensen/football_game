public class Goal {

    private double time;
    private Team team;
    private Player player;



    public Goal(Team team, Player player, double time) {
        this.team = team;
        this.player = player;
        this.time = time;
    }

    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }

    public double getTime() {
        return time;
    }

     public String toString() {
        return ("Goal scored at " + this.getTime() +  " min" + " by team " + this.getTeam().getTeamName() + " by the player " + this.getPlayer().getPlayerName());

    }
}
