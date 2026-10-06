import java.util.ArrayList;

public class WorldMap {
    private Room room1;
    private Enemy enemy;

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

        room1.addItemToRoom(new Food("beer", "elephantbeer", -12));
        room1.addItemToRoom(new RangedWeapon("revolver", "old revolver", 25, 6));

        room2.addItemToRoom(new Item("hook", "long hook to climb the mountain"));
        room2.addItemToRoom(new Item("ladder", "small ladder"));


        room3.addItemToRoom(new Item("torch", "torch"));
        room3.addItemToRoom(new MeleeWeapon("sword", "long sharp sword", 20));

        room4.addItemToRoom(new Item("crowbar", "crowbar to brake down the gates"));
        room4.addItemToRoom(new Food("wiibroe", "Wiibroe", 100));
        room4.addItemToRoom(new Item("sunbed", "sunbed with a shade"));

        room5.addItemToRoom(new Food("sharwarma", "spicy sharwarma thats very good", 25));

        room6.addItemToRoom(new Food("foot", "severed foot with one long nail", -99));

        room8.addItemToRoom(new Item("contract", "Brian Riemer's nationalteam contract"));

        room9.addItemToRoom(new Item("money", "bunny money to pay the girls"));
        room9.addItemToRoom(new Item("privateroom", " privateroom with a chair in the center"));
        room9.addItemToRoom(new Item("pingball", "weird smelly ping ball"));

        //Enemies
        Weapon trollWeapon = new MeleeWeapon("club", "skeleton club", 20);
        room2.addEnemyToRoom(new Enemy("Troll", "disgusting short fat troll", 50, trollWeapon, room2));


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
