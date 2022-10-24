
import java.util.Arrays;
import java.util.Random;

public class Game {

    private Goal[] goals = {};
    private Team homeTeam;
    private Team awayTeam;


    public Game(Team awayTeam, Team homeTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


    public static int randomNumber(int max, int min) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public Goal[] createRandomSizeGoalArray() {
        goals = Arrays.copyOf(goals, randomNumber(6, 1));
        return goals;

    }

    public Goal[] createRandomSizeGoalArray(int maxGoals) {
        goals = Arrays.copyOf(goals, randomNumber(maxGoals, 1));
        return goals;

    }

    public void playGame() {
        GameUtils.addGameGoals(this, -1);
    }

    public void playGame(int maxGoals) {
        GameUtils.addGameGoals(this, maxGoals);
    }

    public String getDescription() {

        StringBuilder gameGoalsString = new StringBuilder();
        String teamVsTeam = homeTeam.getTeamName().concat(" ").concat("VS").concat(" ").concat(awayTeam.getTeamName());
        System.out.println(teamVsTeam);

        int homeTeamGoalCounter = 0;
        int awayTeamGoalCounter = 0;
        String winner = " ";
        String leagueWinner = " ";


        for (Goal g : goals) {

            if (g.getTeam().getTeamName().equals(homeTeam.getTeamName())) {
                homeTeamGoalCounter++;

            } else if (g.getTeam().getTeamName().equals(awayTeam.getTeamName())) {
                awayTeamGoalCounter++;
            }
            gameGoalsString.append(g).append("\n");
        }

        if (homeTeamGoalCounter > awayTeamGoalCounter) {

            winner = homeTeam.getTeamName() + " wins!";
            homeTeam.setPoints(homeTeam.getPoints()+2);

        } else if (homeTeamGoalCounter < awayTeamGoalCounter) {

            winner = awayTeam.getTeamName() + " wins!";
            awayTeam.setPoints(awayTeam.getPoints()+2);

        } else {
            winner = "It's a draw!";
            homeTeam.setPoints(homeTeam.getPoints()+1);
            awayTeam.setPoints(awayTeam.getPoints()+1);
        }


        homeTeam.setGoals(homeTeam.getGoals() + homeTeamGoalCounter);
        awayTeam.setGoals(awayTeam.getGoals() + awayTeamGoalCounter);

            return gameGoalsString + winner + " " + "(" + awayTeamGoalCounter + "-" + homeTeamGoalCounter + ")" + "\n";

        }



    }



