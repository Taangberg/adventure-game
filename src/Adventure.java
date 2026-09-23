public class Adventure {
    private Room currentRoom;


    public Room getCurrentRoom() {
        return currentRoom;

    }

    private void createLabyrinth(){
        Room room1 = new Room("1", "a peacful place with two paths");
        Room room2 = new Room("2", "a dangerous mountain cliff with two paths");
        Room room3 = new Room("3", "a spooky dark forest, with two paths");
        Room room4 = new Room("4", "a scary graveyard, with two paths");
        Room room5 = new Room("5", "you came to the wonderfull beach");
        Room room6 = new Room("6", "a wierd place, with two paths");
        Room room7 = new Room("7","a place, with two paths");
        Room room8 = new Room("8","a confusing, with 3 paths");
        Room room9 = new Room("9","a stripclub, with two paths");

        currentRoom=room1;

    }

}
