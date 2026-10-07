public class Adventure {
    private WorldMap worldMap;
    private Player player;
    private GameUI gameUI;
    private Enemy enemy;
    private Room room;


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
                case "NORTH", "N" -> {
                    IO.println(!player.goNorth() ? "There is no way for me to go north" : "Going north\n" + player.getCurrentRoom());
                }
                case "SOUTH", "S" -> {
                    IO.println(!player.goSouth() ? "There is no way for me to go south" : "Going south\n" + player.getCurrentRoom());
                }
                case "WEST", "W" -> {
                    IO.println(!player.goWest() ? "There is no way for me to go west" : "Going west\n" + player.getCurrentRoom());
                }
                case "EAST", "E" -> {
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
                        currentRoom.addItemToRoom(item);
                    }
                }
                case "EAT", "DRINK" -> {
                    String itemName = command[1];
                    EatResult eat = player.eat(itemName);
                    IO.print(itemName);
                    if (eat == EatResult.EATEN) {
                        gameUI.eaten();
                    } else if (eat == EatResult.NOT_FOOD) {
                        gameUI.notFood();
                    } else {
                        gameUI.notFound();
                    }

                }
                case "EQUIP" -> {
                    String itemName = command[1];
                    Equip equip = player.equip(itemName);
                    IO.print(itemName);
                    if (equip == Equip.EQUIPPED) {
                        gameUI.equipped();
                    } else if (equip == Equip.NOT_WEAPON) {
                        gameUI.notWeapon();
                    } else {
                        gameUI.notFound();
                    }
                }
                case "ATTACK" -> {
                    Weapon weapon = player.getEquipedWeapon();
                    String enemyName = command[1];
                    Room enemyInRoom = room.enemies;
                    if (player.attack(enemyInRoom)) {
                        int ammo = weapon.getammo();
                        if (ammo > 0) {
                            gameUI.attackedWithRanged();
                            IO.println(weapon.getName() + " ammo: " + ammo);
                        } else if (ammo == 0) {
                            gameUI.noAmmo();
                        } else if (ammo == -1) {
                            gameUI.attackedWithMelee();
                            IO.println(weapon.getName());
                        }
                    } else gameUI.noWeaponEquipped();
                }
                case "HEALTH" -> {
                    player.showHealth();
                }
                case "INVENTORY" -> {
                    IO.println(player.inventory);
                }
                case "EQUIPPED" -> {
                    IO.println(player.getEquipedWeapon());
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