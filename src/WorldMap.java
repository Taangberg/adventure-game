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
        ArrayList<Item> room1Items = new ArrayList<>(); // ændre til add items
        room1Items.add(new Food("beer", "a elephantbeer", -12));

        ArrayList<Item> room2Items = new ArrayList<>();
        room2Items.add(new Item("hook", "a long hook to climb the mountain"));
        room2Items.add(new Item("ladder", "a small ladder"));

        ArrayList<Item> room3Items = new ArrayList<>();
        room3Items.add(new Item("flashlight", "a torch"));

        ArrayList<Item> room4Items = new ArrayList<>();
        room4Items.add(new Item("crowbar", "to brake down the gates"));

        ArrayList<Item> room5Items = new ArrayList<>();
        room5Items.add(new Item("beer", "a wirboe"));
        room5Items.add(new Item("sunbed", "with a shade"));

        room5Items.add(new Food("sharwarma", "thats very good", 25));

        ArrayList<Item> room6Items = new ArrayList<>();
        room6Items.add(new Food("foot", "with one long nail", -99));

        ArrayList<Item> room7Items = new ArrayList<>();

        ArrayList<Item> room8Items = new ArrayList<>();
        room8Items.add(new Item("contract", "Brian Riemer's nationalteam contract"));

        ArrayList<Item> room9Items = new ArrayList<>();
        room9Items.add(new Item("money", "bunny money to pay her"));
        room9Items.add(new Item("privateroom", "with a chair"));
        room9Items.add(new Item("pingball", "a wierd smelly pingball"));


        room1 = new Room("1", "A peaceful place with two paths", room1Items);
        Room room2 = new Room("2", "A dangerous mountain cliff with two paths", room2Items);
        Room room3 = new Room("3", "A spooky dark forest, with two paths", room3Items);
        Room room4 = new Room("4", "A scary graveyard, with two paths", room4Items);
        Room room5 = new Room("5", "You came to the wonderful beach", room5Items);
        Room room6 = new Room("6", "A weird place, with two paths", room6Items);
        Room room7 = new Room("7", "A place, with two paths", room7Items);
        Room room8 = new Room("8", "A confusing, with 3 paths", room8Items);
        Room room9 = new Room("9", "A stripclub, with two paths", room9Items);


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
