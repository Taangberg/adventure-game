import java.util.ArrayList;

public class Room {
    String name;
    String description;
    Room north;
    Room east;
    Room south;
    Room west;
    ArrayList<Item> items;

    public Room(String name, String description, ArrayList<Item> items) {
        this.name = name;
        this.description = description;
        this.items = items;
    }

    public String getRoom() {
        return "Room " + name + " " + description + "\n" + items;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public Room getNorth() {
        return north;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public Room getSouth() {
        return south;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public Room getEast() {
        return east;
    }

    public void setWest(Room room) {
        this.west = room;
    }

    public Room getWest() {
        return west;
    }


//    public String toString() {
//        return "You are in room " + name + " \n" + description;
//    }
}
