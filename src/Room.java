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

    public void setNorth(Room room) {
       this.north=room;
    }

    public Room getNorth() {
        return north;
    }

    public void setSouth(Room room) {
        this.south=room;
    }

    public Room getSouth() {
        return south;
    }

    public void setEast(Room room) {
        this.east=room;
    }

    public Room getEast() {
        return east;
    }

    public void setWest(Room room) {
        this.west=room;
    }

    public Room getWest() {
        return west;
    }

    @Override
    public String toString() {
        return "You are in room " + name + " \n" + description;
    }
}
