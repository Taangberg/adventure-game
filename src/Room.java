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
        return north;
    }

    public Room getNorth() {
        return north;
    }

    public Room setSouth(Room room) {
        return south;
    }

    public Room getSouth() {
        return south;
    }

    public Room setEast(Room room) {
        return east;
    }

    public Room getEast() {
        return east;
    }

    public Room setWest(Room room) {
        return east;
    }

    public Room getWest() {
        return east;
    }

}
