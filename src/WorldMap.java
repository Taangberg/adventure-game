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

        room1 = new Room("1", "A peaceful place with two paths");
        Room room2 = new Room("2", "A dangerous mountain cliff with two paths");
        Room room3 = new Room("3", "A spooky dark forest, with two paths");
        Room room4 = new Room("4", "A scary graveyard, with two paths");
        Room room5 = new Room("5", "You came to the wonderful beach");
        Room room6 = new Room("6", "A weird place, with two paths");
        Room room7 = new Room("7", "A place, with two paths");
        Room room8 = new Room("8", "A confusing intercross, with 3 paths, and a podium in the middle ");
        Room room9 = new Room("9", "A stripclub, with two paths");

        room1.addToRoom(new Food("beer", "a elephantbeer", -12));
        room1.addToRoom(new RangedWeapon("revolver", "an old revolver", 6));

        room2.addToRoom(new Item("hook", "a long hook to climb the mountain"));
        room2.addToRoom(new Item("ladder", "a small ladder"));

        room3.addToRoom(new Item("torch", "a torch"));
        room3.addToRoom(new MeleeWeapon("sword", "a long sharp sword"));

        room4.addToRoom(new Item("crowbar", "a crowbar to brake down the gates"));
        room4.addToRoom(new Food("wiibroe", "a Wiibroe", 100));
        room4.addToRoom(new Item("sunbed", "a sunbed with a shade"));

        room5.addToRoom(new Food("sharwarma", "a spicy sharwarma thats very good", 25));

        room6.addToRoom(new Food("foot", "a severed foot with one long nail", -99));

        room8.addToRoom(new Item("contract", "Brian Riemer's nationalteam contract"));

        room9.addToRoom(new Item("money", " bunny money to pay the girls"));
        room9.addToRoom(new Item("privateroom", " a privateroom with a chair in the center"));
        room9.addToRoom(new Item("pingball", "a weird smelly ping ball"));


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
