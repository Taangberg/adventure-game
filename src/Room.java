import java.util.ArrayList;

public class Room {
    String name;
    String description;
    Room north;
    Room east;
    Room south;
    Room west;
    ArrayList<Item> items;
    ArrayList<Enemy> enemies;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
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

    public Item takeItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);

            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(i);
                return item;
            }
        }
        return null;
    }

    public void addItemToRoom(Item item) {
        items.add(item);
    }

    public void addEnemyToRoom(Enemy enemy) {
        enemies.add(enemy);
    }

    public String toString() {
        String a = "Here you see: a ";
        String b = "Beware! Here lurks: a ";
        for (Item item : items) {
            a += item + ", ";
        }
        for (Enemy enemy : enemies) {
            b += enemy + ", ";
        }
        if (items.isEmpty() && enemies.isEmpty()) {
            return "Room " + name + " - " + description + "\n" + "In here there is nothing";
        } else if (items.isEmpty()) {
            return "Room " + name + " - " + description + "\n" + b;
        } else if (enemies.isEmpty()) {
            return "Room " + name + " - " + description + "\n" + a;
        }

        return "Room " + name + " - " + description + "\n" + a + "\n" + b;
    }
}
