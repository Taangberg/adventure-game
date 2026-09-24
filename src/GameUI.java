public class GameUI {

    boolean gameIsRunning = true;

    public void startGame() {
        Adventure adventure = new Adventure();

        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nTo move around the labyrinth, type: 'GO' + direction");

        while (gameIsRunning) {

            String commando = IO.readln().toUpperCase();
            Room currentRoom = adventure.getCurrentRoom();

            switch (commando) {
                case "GO NORTH" -> {
                    IO.println("Going north!");
                    if (!adventure.goNorth()) {
                        IO.println("There is no way for me to go north");
                        return;
                    }
                    IO.println(currentRoom);
                }
                case "GO SOUTH" -> {
                    IO.println("Going south");
                    if (!adventure.goSouth()) {
                        IO.println("There is no way for me to go south");
                        return;
                    }
                    IO.println(currentRoom);
                }
                case "GO WEST" -> {
                    IO.println("Going west");
                    if (!adventure.goWest()) {
                        IO.println("There is no way for me to go west");
                        return;
                    }
                    IO.println(currentRoom);
                }
                case "GO EAST" -> {
                    IO.println("Going east");
                    if (!adventure.goEast()) {
                        IO.println("There is no way for me to go east");
                        return;
                    }
                    IO.println(currentRoom);
                }
                case "LOOK" -> {
                    IO.println(currentRoom);
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
