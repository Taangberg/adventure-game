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

        gameUI.welcome(player.getCurrentRoom().toString());

        while (gameIsRunning) {

            String[] command = gameUI.userInput().split(" ");

            switch (command[0]) {
                case "NORTH", "N" -> {
                    gameUI.goNorthMsg(player.goNorth(), player.getCurrentRoom().toString());
                }
                case "SOUTH", "S" -> {
                    gameUI.goSouthMsg(player.goSouth(), player.getCurrentRoom().toString());
                }
                case "WEST", "W" -> {
                    gameUI.goWestMsg(player.goWest(),player.getCurrentRoom().toString());

                }
                case "EAST", "E" -> {
                    gameUI.goEastMsg(player.goEast(),player.getCurrentRoom().toString());
                }
                case "LOOK" -> {
                    IO.println(player.getCurrentRoom());
                }
                case "TAKE" -> {
                    if (command.length > 1) {
                        String itemName = command[1];
                        Room currentRoom = player.getCurrentRoom();
                        Item item = currentRoom.takeItem(itemName);

                        if (item == null) {
                            gameUI.itemNotFound(itemName);
                        } else {
                            gameUI.itemAddedToInventory(itemName);
                            player.addToInventory(item);
                        }
                    }
                }
                case "REMOVE", "DROP" -> {
                    if (command.length > 1) {
                        String itemName = command[1];
                        Room currentRoom = player.getCurrentRoom();
                        Item item = player.removeItem(itemName);

                        if (item == null) {
                            gameUI.itemNotInInventory(itemName);
                        } else {
                            gameUI.itemDropped(itemName);
                            currentRoom.addItemToRoom(item);
                        }
                    }
                }
                        case "EAT", "DRINK" -> {
                            if (command.length > 1) {
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
                        }

                        case "EQUIP" -> {
                            if (command.length > 1) {
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
                        }
                        case "ATTACK", "SHOOT", "FIRE" -> {
                            if (command.length > 1) {
                                String enemyName = command[1];
                                Enemy enemyInRoom = player.getCurrentRoom().findEnemy(enemyName);

                                if (enemyInRoom != null) {
                                    Weapon weapon = player.getEquipedWeapon();

                                    if (weapon != null) {
                                        int ammo = weapon.getammo();

                                        if (ammo == 0) {
                                            gameUI.noAmmo();
                                        } else {
                                            if (player.attack(enemyInRoom)) {

                                                if (ammo > 0) {
                                                    gameUI.attackedWithRanged();
                                                    gameUI.rangedWepAmmo(weapon.getName(), weapon.getammo());
                                                } else if (ammo == -1) {
                                                    gameUI.attackedWithMelee(weapon.getName());
                                                }
                                                gameUI.playerDamageDealt(weapon.damage);
                                                if (enemyInRoom.health > 0) {
                                                    gameUI.enemyHpLeft(enemyInRoom.name,enemyInRoom.getHealth());
                                                } else {
                                                    gameUI.enemyDied(enemyInRoom.name);
                                                    gameUI.enemyDroppedWep(enemyInRoom.name, enemyInRoom.enemyWeapon.name);
                                                }

                                                if (enemyInRoom.getHealth() > 0) {
                                                    enemyInRoom.attack(player);
                                                    gameUI.enemyDamageDealt(enemyInRoom.name, enemyInRoom.enemyWeapon.damage);
                                                    gameUI.playerHealthLeft(player.getHealth());
                                                    if (player.getHealth() <= 0) {
                                                        gameUI.gameOver();
                                                        gameIsRunning = false;
                                                    }

                                                }
                                            }
                                        }
                                    } else {
                                        gameUI.noWeaponEquipped();
                                    }
                                } else {
                                    gameUI.noEnemyFound();
                                }
                            } else {
                                gameUI.missSpelledEnemy();
                            }
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