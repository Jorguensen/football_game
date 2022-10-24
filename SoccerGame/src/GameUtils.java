import java.util.Random;

public class GameUtils {
    public  Team[] createTeams() {
        Player[] playersTeam1 = {new Player("George Eliot"), new Player("Graham Greene"), new Player("Geoffrey Chaucer")};
        Team homeTeam = new Team("The Greens", playersTeam1);

        Player[] playersTeam2 = {new Player("Robert Service"), new Player("Robbie Burns"), new Player("Rafael Sabatini")};
        Team awayTeam = new Team("The Reds", playersTeam2);

        return new Team[]{homeTeam, awayTeam};
    }


    public Game[] createGame(Team[] theTeams) {
        Game game1 = new Game(theTeams[1], theTeams[0]);
        Game game2 = new Game(theTeams[1], theTeams[0]);
        Game game3 = new Game(theTeams[1], theTeams[0]);
        Game game4 = new Game(theTeams[0], theTeams[1]);

        return new Game[]{game1, game2, game3, game4};
    }

    public static int randomNumber(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void addGameGoals(Game game, int maxGoals) {
        GameUtils gameUtils = new GameUtils();

        Goal[] gameGoals;
        if (maxGoals <= 0) {
            gameGoals = game.createRandomSizeGoalArray();

            for (int i = 0; i < gameGoals.length; i++) {
                Team randomTeam = gameUtils.createTeams()[(int) Math.round(Math.random())];
                Player randomPlayer = randomTeam.getPlayers()[randomNumber(4, 0)];
                double randomTime = Math.floor(Math.random() * 90);

                gameGoals[i] = new Goal(randomTeam, randomPlayer, randomTime);


            }

        }
        else{
            gameGoals = game.createRandomSizeGoalArray(maxGoals);

            for (int i = 0; i < gameGoals.length; i++) {
                Team randomTeam = gameUtils.createTeams()[(int) Math.round(Math.random())];
                Player randomPlayer = randomTeam.getPlayers()[randomNumber(2, 0)];
                double randomTime = Math.floor(Math.random() * 90);

                gameGoals[i] = new Goal(randomTeam, randomPlayer, randomTime);


            }

        }

    }

}

