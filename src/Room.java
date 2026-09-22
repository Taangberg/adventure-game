public class Room {
    public void startGame() {

        boolean gameIsRunning = false;

        IO.println("Welcome to game");
        IO.println("Type which direction you would like to go");

        while (!gameIsRunning) {

            String commando = IO.readln().toUpperCase();

            switch (commando) {
                case "GO NORTH"  -> {
                    IO.println("Going north!");
                    IO.println("Arrived at added room");
                }
            }

        }
    }
}
