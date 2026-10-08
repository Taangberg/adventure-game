public class GameUI {
    public String welcome(String roomName) {
        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nTo move around the labyrinth, type: which coordinate you want to move \nYou are currently in\n"+roomName);

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
        IO.println("To move around type: which coordinate you want to move");
        IO.println("To get information about the current room, type: 'LOOK'");
        IO.println("To pick up a item, type: TAKE + itemName");
        IO.println("To stop the current game type: 'EXIT'");
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
