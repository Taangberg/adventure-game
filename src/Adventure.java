public class Adventure {
    private Room currentRoom = new Room("1", "a peacful place with two paths");


    public Room getCurrentRoom() {
        return currentRoom;

    }

    private void createLabyrinth() {
        Room room1 = new Room("1", "a peacful place with two paths");
        Room room2 = new Room("2", "a dangerous mountain cliff with two paths");
        Room room3 = new Room("3", "a spooky dark forest, with two paths");
        Room room4 = new Room("4", "a scary graveyard, with two paths");
        Room room5 = new Room("5", "you came to the wonderfull beach");
        Room room6 = new Room("6", "a wierd place, with two paths");
        Room room7 = new Room("7", "a place, with two paths");
        Room room8 = new Room("8", "a confusing, with 3 paths");
        Room room9 = new Room("9", "a stripclub, with two paths");

        currentRoom = room1;

        room1.setEast(room2).setSouth(room4);
        room2.setWest(room1).setEast(room3);
        room3.setWest(room2).setSouth(room6);
        room4.setNorth(room1).setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3).setSouth(room9);
        room7.setNorth(room4).setEast(room8);
        room8.setWest(room7).setNorth(room5).setEast(room9);
        room9.setNorth(room6).setWest(room8);
    }

    public boolean goNorth() {
        currentRoom = currentRoom.getNorth();
        return currentRoom != null;
    }

    public boolean goSouth() {
        currentRoom = currentRoom.getSouth();
        return currentRoom != null;
    }

    public boolean goEast() {
        currentRoom = currentRoom.getEast();
        return currentRoom != null;
    }

    public boolean goWest() {
        currentRoom = currentRoom.getWest();
        return currentRoom != null;
    }
}
