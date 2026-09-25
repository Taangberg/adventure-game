import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    ArrayList<Item> inventory;

    public Player(Room firstRoom, ArrayList<Item> inventory) {
        this.currentRoom = firstRoom;
        this.inventory = inventory;
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
