public class Player {
    private Room currentRoom;

    public Player(Room firstRoom) {
        this.currentRoom = firstRoom;
    }

    public String whereAreYou() {
        return currentRoom.getRoom();
    }

    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        }
        currentRoom = currentRoom.getNorth();
        return true;
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        }
        currentRoom = currentRoom.getSouth();
        return true;
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;
        }
        currentRoom = currentRoom.getEast();
        return true;
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        }
        currentRoom = currentRoom.getWest();
        return true;
    }

}
