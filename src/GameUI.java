public class GameUI {
    public String welcome() {
        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nTo move around the labyrinth, type: 'GO' + direction \n");
        return name;
    }

    public String userInput() {
        return IO.readln().toUpperCase();
    }

    public void help() {
        IO.println("To move around type: 'GO' + direction");
        IO.println("To get information about the current room, type: 'LOOK'");
        IO.println("To stop the current game type: 'EXIT'");
    }

    public void exit() {
        IO.println("Thanks for playing.");
        IO.println("Goodbye");

    }
}
