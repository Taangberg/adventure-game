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


        gameUI.Velkomst();

        IO.println(player.whereAreYou());

        while (gameIsRunning) {

            switch (gameUI.userInput()) {
                case "GO NORTH" -> {
                    if (!player.goNorth()) {
                        IO.println("There is no way for me to go north");
                    } else {
                        IO.println("Going north!");
                        IO.println(player.whereAreYou());
                    }
                }
                case "GO SOUTH" -> {
                    if (!player.goSouth()) {
                        IO.println("There is no way for me to go south");
                    } else {
                        IO.println("Going south");
                        IO.println(player.whereAreYou());
                    }
                }
                case "GO WEST" -> {
                    if (!player.goWest()) {
                        IO.println("There is no way for me to go west");
                    } else {
                        IO.println("Going west");
                        IO.println(player.whereAreYou());
                    }
                }
                case "GO EAST" -> {
                    if (!player.goEast()) {
                        IO.println("There is no way for me to go east");
                    } else {
                        IO.println("Going east");
                        IO.println(player.whereAreYou());
                    }
                }
                case "LOOK" -> {
                    IO.println(player.whereAreYou());
                }
                case "HELP" -> {
                    gameUI.help();
                }
                case "EXIT" -> {
                    IO.println("Thanks for playing.");
                    IO.println("Goodbye");
                    gameIsRunning = false;
                }
            }
        }
    }
}