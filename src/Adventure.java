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

        IO.println("You are currently in\n" + player.getCurrentRoom());

        while (gameIsRunning) {

            switch (gameUI.userInput()) {
                case "GO NORTH" -> {
                    IO.println(!player.goNorth() ? "There is no way for me to go north" : "Going north!\n" + player.getCurrentRoom());
                }
                case "GO SOUTH" -> {
                    IO.println(!player.goSouth() ? "There is no way for me to go south" : "Going south\n" + player.getCurrentRoom());
                }
                case "GO WEST" -> {
                    IO.println(!player.goWest() ? "There is no way for me to go west" : "Going west\n" + player.getCurrentRoom());
                }
                case "GO EAST" -> {
                    IO.println(!player.goEast() ? "There is no way for me to go east" : "Going east\n" + player.getCurrentRoom());
                }
                case "LOOK" -> {
                    IO.println(player.getCurrentRoom());
                }
                case "TAKE" -> {
                    String itemOnGround = gameUI.userInput();
                    Room currentRoom = player.getCurrentRoom();
                    Item item = currentRoom.takeItem(itemOnGround);

                    if (item == null) {
                        IO.println(itemOnGround + " not found");
                    } else {
                        IO.println(itemOnGround + " added to your inventory");
                        player.addToInventory(item);
                    }
                }
//                case "REMOVE" -> {
//                    String itemToDrop = gameUI.userInput();
//                    Room currentRoom = player.getCurrentRoom();
//                    Item item = player.removeItem(itemToDrop);
//
//                    if
//                }
                case "INVENTORY" -> {
                    IO.println(player.inventory);
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