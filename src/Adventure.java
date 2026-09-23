public class Adventure {
Room currentRoom = new Room("1", "This room is a very peaceful place, with two paths");

    boolean gameIsRunning = true;

    public void startGame() {
        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello "+ name + "\nTo move around the labyrinth, type: 'GO' + direction");

        while (gameIsRunning) {

            String commando = IO.readln().toUpperCase();

            switch (commando) {
                case "GO NORTH" -> {
                    IO.println("Going north!");
                    IO.println("Arrived at added room");
                }
                case "GO SOUTH" -> {
                    IO.println("Going south");
                    IO.println("Arrived at added room");
                }
                case "GO WEST" -> {
                    IO.println("Going west");
                    IO.println("Arrived at added room");
                }
                case "GO EAST" -> {
                    IO.println("Going east");
                    IO.println("Arrived at added room");
                }
                case "LOOK" -> {
                    IO.println("You are in currentRoom");
                    IO.println("Looking around");
                    IO.println("Description of currentRoom");
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
                    IO.println(currentRoom);
                }
            }
        }
    }
}
