public class Adventure {
    private WorldMap worldMap;
    private Player player;
    private GameUI gameUI;

    public Adventure() {
        gameUI = new GameUI();
        worldMap = new WorldMap();
        player = new Player(worldMap.getFirstRoom());
    }

    boolean gameIsRunning = true;

    public void startGame() {


        gameUI.welcome();

        IO.println("You are currently in\n" + player.whereAreYou());

        while (gameIsRunning) {

            switch (gameUI.userInput()) {
                case "GO NORTH" -> {
                    IO.println(!player.goNorth() ? "There is no way for me to go north" : "Going north!\n" + player.whereAreYou());
                }
                case "GO SOUTH" -> {
                    IO.println(!player.goSouth() ? "There is no way for me to go south" : "Going south\n" + player.whereAreYou());
                }
                case "GO WEST" -> {
                    IO.println(!player.goWest() ? "There is no way for me to go west" : "Going west\n" + player.whereAreYou());
            }
                case "GO EAST" -> {
                    IO.println(!player.goEast() ? "There is no way for me to go east" : "Going east\n" + player.whereAreYou());
                }
                case "LOOK" -> {
                    IO.println(player.whereAreYou());
                }
                case "HELP" -> {
                    gameUI.help();
                }
                case "EXIT" -> {
                    gameUI.exit();
                    gameIsRunning = false;
                }
            }
        }
    }
}