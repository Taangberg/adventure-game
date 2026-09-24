public class GameUI {

    boolean gameIsRunning = true;

    public void startGame() {
        Adventure adventure = new Adventure();
        
        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nTo move around the labyrinth, type: 'GO' + direction \n");
        IO.println(adventure.getCurrentRoom());

        while (gameIsRunning) {

            String commando = IO.readln().toUpperCase();

            switch (commando) {
                case "GO NORTH" -> {
                    if (!adventure.goNorth()) {
                        IO.println("There is no way for me to go north");
                    } else {
                        IO.println("Going north!");
                        IO.println(adventure.getCurrentRoom());
                    }
                }
                case "GO SOUTH" -> {
                    if (!adventure.goSouth()) {
                        IO.println("There is no way for me to go south");
                    } else {
                        IO.println("Going south");
                        IO.println(adventure.getCurrentRoom());
                    }
                }
                case "GO WEST" -> {
                    if (!adventure.goWest()) {
                        IO.println("There is no way for me to go west");
                    } else {
                        IO.println("Going west");
                        IO.println(adventure.getCurrentRoom());
                    }
                }
                case "GO EAST" -> {
                    if (!adventure.goEast()) {
                        IO.println("There is no way for me to go east");
                    } else {
                        IO.println("Going east");
                        IO.println(adventure.getCurrentRoom());
                    }
                }
                case "LOOK" -> {
                    IO.println(adventure.getCurrentRoom());
                }
                case "HELP" -> {
                    IO.println("To move around type: 'GO' + direction");
                    IO.println("To get information about the current room, type: 'LOOK'");
                    IO.println("To stop the current game type: 'EXIT'");
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
