public class GameUI {
    public String welcome(String roomName) {
        IO.println("\n\t>>>>> Dimensions & Dollar Bills <<<<<\n\n" +
                "You wake up in a peaceful clearing with an Elephant Beer in your hand and an old revolver\ntucked into your belt. Ahead lies a surreal odyssey through dimensions that range from\nthe deeply unsettling to the downright absurd.\n\n" +
                "Your journey will take you across treacherous mountain cliffs, through spooky dark\nforests, and past a scary graveyard where you can scavenge for Wiibroe beers and a\nsunbed. Along the way, the laws of physics collapse in a room where the floor is the\nceiling, and you will face the macabre sight of a familiar donkey corpse split in half rotting\nin a swamp.\n\n" +
                "After navigating a confusing intercross, you will finally stand before the doors of the\nprivate room. Behind them lies no dragon or demon, but the ultimate endgame challenge:\nThe Final Boss—a ruthless stripper waiting in the neon-lit smoke. To survive this final\nencounter, you must utilize everything you have gathered, from your trusty crowbar and\nspicy shawarmas to your stash of bunny money. Can you make it out of the VIP lounge\nalive?\n\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nIf you need help, type: HELP\nYou are currently in\n"+roomName);

        return name;
    }

    public String userInput() {
        return IO.readln().toUpperCase();
    }



    public void notFood() {
        IO.println(" is not food, and can't be eaten");
    }

    public void notFound() {
        IO.println(" is not found");
    }
    public void itemNotFound(String itemName){
        IO.println(itemName + " not found");
    }
    public void itemAddedToInventory(String itemName){
        IO.println(itemName + " added to your inventory");
    }
    public void itemNotInInventory(String itemName){
        IO.println(itemName + " not in your inventory");
    }
    public void itemDropped(String itemName) {
        IO.println(itemName + " removed from inventory");
    }
    public void notWeapon() {
        IO.println(" is not a weapon, and you can't equip it");
    }

    public void equipped() {
        IO.println(" is successfully equipped");
    }

    public void eaten() {
        IO.println(" is successfully digested");
    }

    public void noWeaponEquipped() {
        IO.println("You don't have any weapon equipped");
    }

    public void attackedWithRanged() {
        IO.print("You fired the ");
    }

    public void attackedWithMelee(String weapon) {
        IO.print("You swung the "+ weapon + ". ");
    }
    public void rangedWepAmmo(String weapon, int ammo){
        IO.println(weapon + " ammo: " +ammo);
    }

    public void noAmmo() {
        IO.println("You are out of ammo");
    }
    public void missSpelledEnemy(){
        IO.println("Who do you want to attack?");
    }
    public void noEnemyFound(){
        IO.println("Enemy not found!");
    }
    public void gameOver(){
        IO.println("You died\n>>>>>> GAME OVER <<<<<<");
    }
    public void youWin() {
        IO.println("Congrats");
    }
    public void playerHealthLeft(int getHealth) {
        IO.println("You have: " + getHealth + " hp left");
    }
    public void playerDamageDealt(int damage){
        IO.println("You dealt " + damage + " dmg");
    }
    public void enemyDamageDealt(String name, int damage) {
        IO.println(name + " dealt " + damage + " dmg");
    }
    public void enemyDroppedWep(String name, String wepName) {
        IO.println(name + " dropped " + wepName);
    }
    public void enemyDied(String name){
        IO.println(name+ " died");
    }
    public void enemyHpLeft(String enemyName, int enemyHp){
        IO.println(enemyName + " has: " + enemyHp + " hp left.");
    }
    public void help() {
        IO.println("""
                
                MOVEMENT & NAVIGATION
                
                • NORTH / N: to move north.
                • SOUTH / S: to move south.
                • EAST / E: to move east.
                • WEST / W: to move west.
                • LOOK: Examine the current room.
                
                ITEM MANAGEMENT
                
                • TAKE [item]: Pick up an item.
                • REMOVE / DROP [item]: Drop an item.
                • EAT / DRINK [food/drink]: Consume edible.
                
                COMBAT & EQUIPMENT
                
                • EQUIP [weapon]: Equip a weapon from your inventory.
                • ATTACK / SHOOT / FIRE [enemy]: Attack a specific enemy.
                • EQUIPPED: Displays the weapon you are currently holding
                	• Melee weapons have infinite durability, while ranged weapons require ammunition.
                	• Watch out! If the enemy survives your attack, they will strike back immediately.
                
                
                STATUS & SYSTEM
                
                • HEALTH: Check your current health.
                • INVENTORY: Open your backpack.
                • HELP: Displays this menu
                • EXIT: Immediately closes the game.
                """);
    }


    public void exit() {
        IO.println("Thanks for playing.");
        IO.println("Goodbye");

    }

    public void goNorthMsg(boolean goNorth, String roomName) {
        IO.println(goNorth ? "Going north\n" + roomName : "There is no way for me to go north"  );
    }

    public void goSouthMsg(boolean goSouth, String roomName) {
        IO.println(goSouth ? "Going south\n" + roomName : "There is no way for me to go south");
    }

    public void goWestMsg(boolean goWest, String roomName) {
        IO.println(goWest ? "Going west\n" +roomName : "There is no way for me to go west");

    }

    public void goEastMsg(boolean goEast, String roomName) {
        IO.println(goEast ? "Going east\n" + roomName : "There is no way for me to go east");

    }
}
