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

            String[] command = gameUI.userInput().split(" ");

            switch (command[0]) {
                case "NORTH" -> {
                    IO.println(!player.goNorth() ? "There is no way for me to go north" : "Going north!\n" + player.getCurrentRoom());
                }
                case "SOUTH" -> {
                    IO.println(!player.goSouth() ? "There is no way for me to go south" : "Going south\n" + player.getCurrentRoom());
                }
                case "WEST" -> {
                    IO.println(!player.goWest() ? "There is no way for me to go west" : "Going west\n" + player.getCurrentRoom());
                }
                case "EAST" -> {
                    IO.println(!player.goEast() ? "There is no way for me to go east" : "Going east\n" + player.getCurrentRoom());
                }
                case "LOOK" -> {
                    IO.println(player.getCurrentRoom());
                }
                case "TAKE" -> {
                    String itemName = command[1];
                    Room currentRoom = player.getCurrentRoom();
                    Item item = currentRoom.takeItem(itemName);

                    if (item == null) {
                        IO.println(itemName + " not found");
                    } else {
                        IO.println(itemName + " added to your inventory");
                        player.addToInventory(item);
                    }
                }
                case "REMOVE" -> {
                    String itemName = command[1];
                    Room currentRoom = player.getCurrentRoom();
                    Item item = player.removeItem(itemName);

                    if (item == null) {
                        IO.println(itemName + " not in your inventory");
                    } else {
                        IO.println(itemName + " removed from inventory");
                        currentRoom.addToRoom(item);
                    }
                }
                case "HEALTH" -> {
                    player.getHealth();
                }
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