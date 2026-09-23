public class Adventure {
    boolean gameIsRunning = true;

    public void startGame() {
        IO.println("Welcome to game");
        IO.println("Type which direction you would like to go");

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
            }
        }
    }
}
