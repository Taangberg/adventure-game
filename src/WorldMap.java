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
        Room room6 = new Room("6", "A weird place, where the floor is the celling and the celling is the floor, with two paths");
        Room room7 = new Room("7", "A familiar looking swamp, with a donkey corpse split in half, with two paths");
        Room room8 = new Room("8", "A confusing intercross, with 3 paths, and a podium in the middle ");
        Room room9 = new Room("9", "A private room, with two doors");

        room1.addItemToRoom(new Food("beer", "elephant beer", -12));
        room1.addItemToRoom(new RangedWeapon("revolver", "old revolver", 40, 6));

        room2.addItemToRoom(new Item("hook", "long hook to climb the mountain"));
        room2.addItemToRoom(new Item("ladder", "small ladder"));
        room2.addItemToRoom(new Food("goat","goat head, with a sour stench", 30));

        room3.addItemToRoom(new Item("torch", "torch"));
        room3.addItemToRoom(new MeleeWeapon("sword", "long sharp sword", 40));

        room4.addItemToRoom(new MeleeWeapon("crowbar", "crowbar to brake down the gates, and monsters", 40));
        room4.addItemToRoom(new Food("wiibroe", "Wiibroe", 100));
        room4.addItemToRoom(new Item("sunbed", "sunbed with a shade"));

        room5.addItemToRoom(new Food("sharwarma", "spicy sharwarma thats very good", 75));
        room5.addItemToRoom(new Food("water", "saltwater from the ocean", 60));
        room5.addItemToRoom(new Food("cocktail", "cocktail with strong smell of coconut and rum", 40));
        room5.addItemToRoom(new RangedWeapon("money", "bunny money to pay the girl", 1500, 1));

        room6.addItemToRoom(new Food("foot", "severed foot with one long nail, it looks like it can be digested", -99));
        room6.addItemToRoom(new Food("potion", "health potion", 100));

        room8.addItemToRoom(new Item("contract", "Brian Riemer's nationalteam contract"));

        room9.addItemToRoom(new Item("pingball", "weird smelly yellowing ping ball"));

        //Enemy Weapons
        Weapon trollWeapon = new MeleeWeapon("club", "skeleton club", 20);
        Weapon bearWeapon = new MeleeWeapon("arm", "bear arm from a dead bear", 30);
        Weapon wolfWeapon = new RangedWeapon("gun", "gun with rabies bullets", 32, 10);
        Weapon ghostWeapon = new RangedWeapon("lantern", "lantern with a sharp green glow", 50, 12);
        Weapon paintingWeapon = new RangedWeapon("brush", "paintingbrush that has the color purple on it, but shoots red for dramatic effect", 5, 100);
        Weapon sherkWeapon = new MeleeWeapon("mace", "mace with blood dripping from the top", 40);
        Weapon riemerWeapon = new RangedWeapon("card", "yellow card with razorblades taped to it", 1, 1);
        Weapon kasperWeapon = new MeleeWeapon("gloves", "sticky goalkeeper gloves", 5);
        Weapon guardWeapon = new MeleeWeapon("knuckels", "gold knuckels that shines up the whole room", 40);
        Weapon stripperWeapon = new MeleeWeapon("pole", "stripper pole that has been ripped straight out of the floor", 1500);

        //Enemies
        room2.addEnemyToRoom(new Enemy("Troll", "disgusting short fat troll", 50, trollWeapon, room2));

        room3.addEnemyToRoom(new Enemy("Bear", "bear that can stand on its feet", 75, bearWeapon, room3));
        room3.addEnemyToRoom(new Enemy("Werewolf", "werewolf with a foaming mouth", 80, wolfWeapon, room3));

        room4.addEnemyToRoom(new Enemy("Ghost", "ghost that's levitating above a broken grave", 40, ghostWeapon, room4));

        room6.addEnemyToRoom(new Enemy("Painting", "abstract painting of what looks to be the ghost", 90, paintingWeapon, room6));

        room7.addEnemyToRoom(new Enemy("Shrek", "big green ogre that screams 'THIS IS MY SWAMP'", 150, sherkWeapon, room7));

        room8.addEnemyToRoom(new Enemy("Brian", "Brian Reimer that looks to be guarding the podium tightly", 1000, riemerWeapon, room8));
        room8.addEnemyToRoom(new Enemy("Kasper", "Kasper Schmeichel with his slow looking movements standing before Riemer", 20, kasperWeapon, room8));

        room9.addEnemyToRoom(new Enemy("Guard", "Security guard with a all black outfit and sunglasses on", 70, guardWeapon, room9));
        room9.addEnemyToRoom(new Enemy("Stripper", "The strongest person in the world, that so happens to be a stripper",100, stripperWeapon, room9));


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
