public class Room {
    String name;
    String description;
    Room north;
    Room east;
    Room south;
    Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room setNorth(Room room) {
        return room;
    }

    public Room getNorth() {
        return Room;
    }

    public Room setSouth(Room room) {
        return room;
    }

    public Room getSouth() {
        return Room;
    }

    public Room setEast(Room room) {
        return room;
    }

    public Room getEast() {
        return Room;
    }

    public Room setWest(Room room) {
        return room;
    }

    public Room getWest() {
        return Room;
    }

}
