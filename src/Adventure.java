public class Adventure {
    private Room currentRoom;

    public Adventure() {
        createLabyrinth();
    }

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

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room9.setNorth(room6);
        room9.setWest(room8);
    }

    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        }
        currentRoom = currentRoom.getNorth();
        return true;
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null){
            return false;
        }
        currentRoom = currentRoom.getSouth();
        return true;
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null){
            return false;
        }
        currentRoom = currentRoom.getEast();
        return true;
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null){
            return false;
        }
        currentRoom = currentRoom.getWest();
        return true;
    }
}
