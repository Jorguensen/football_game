import org.w3c.dom.ls.LSOutput;

public class League {

    public static void main(String[] args) {

        // ************************************************************************ //
        League league = new League();
        GameUtils gameCreator = new GameUtils();
        Team[] gamingTeams = gameCreator.createTeams(); // Create the teams for the game Greens and Red
        Game[] numberOfGames = gameCreator.createGame(gamingTeams);

        for (Game gameNumber : numberOfGames) {//Print game description for each game(game1, game2, game3, game4  In the array)
            gameNumber.playGame(5);
            System.out.println(gameNumber.getDescription());
        }


        league.showBestTeam(gamingTeams);


    }

    public void showBestTeam(Team[] teams){
        System.out.println("Team Points: ");

        for (Team t : teams) {
            String name = t.getTeamName();
            System.out.println(name + " " + t.getPoints() + " Points" + " : " + t.getGoals() + " Goals");

        }
    }

     // ******************************************************************************** //

    public String playerFinder(Player player) {
        String result = " ";
        if (player.getPlayerName().contains("Sab")) {
            result = player.getPlayerName();
        }

        return result;
    }

    public String firstName (Player player){
        String []split = player.getPlayerName().split(" ");
        return split[0];
    }

    public String lastName(Player player){
        String []split = player.getPlayerName().split(" ");
        return split[split.length-1];
    }



}




