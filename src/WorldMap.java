import java.util.ArrayList;

public class WorldMap {
    private Room room1;

    public WorldMap() {
        createWorld();
    }

    public Room getFirstRoom() {
        return room1;
    }

    private void createWorld() {
        ArrayList<Item> room1Items = new ArrayList<>();
        room1Items.add(new Item("a beer", "a elephantbeer"));

        ArrayList<Item> room2Items = new ArrayList<>();
        room2Items.add(new Item("a hook", "a long hook to climb the mountain"));
        room2Items.add(new Item("a ladder","a small ladder"));

        ArrayList<Item> room3Items = new ArrayList<>();
        room3Items.add(new Item("a flashlight", "a torch"));

        ArrayList<Item> room4Items = new ArrayList<>();
        room4Items.add(new Item("a crowbar", "to brake down the gates"));

        ArrayList<Item> room5Items = new ArrayList<>();
        room5Items.add(new Item("a beer", "a wirboe"));
        room5Items.add(new Item("a sharwarma", "thats very good"));
        room5Items.add(new Item("a sunbed", "with a shade"));

        ArrayList<Item> room6Items = new ArrayList<>();
        room6Items.add(new Item("a foot", "with one long nail"));

        ArrayList<Item> room7Items = new ArrayList<>();

        ArrayList<Item> room8Items = new ArrayList<>();
        room8Items.add(new Item("a contract", "Brian Riemer's nationalteam contract"));

        ArrayList<Item> room9Items = new ArrayList<>();
        room9Items.add(new Item("a money", "bunny money to pay her"));
        room9Items.add(new Item("a privateroom", "with a chair"));
        room9Items.add(new Item("a pingball", "a wierd smelly pingball"));


        room1 = new Room("1", "a peaceful place with two paths", room1Items);
        Room room2 = new Room("2", "a dangerous mountain cliff with two paths", room2Items);
        Room room3 = new Room("3", "a spooky dark forest, with two paths", room3Items);
        Room room4 = new Room("4", "a scary graveyard, with two paths", room4Items);
        Room room5 = new Room("5", "you came to the wonderful beach", room5Items);
        Room room6 = new Room("6", "a weird place, with two paths", room6Items);
        Room room7 = new Room("7", "a place, with two paths", room7Items);
        Room room8 = new Room("8", "a confusing, with 3 paths", room8Items);
        Room room9 = new Room("9", "a stripclub, with two paths", room9Items);


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
}
