public class GameUI {
    public String welcome() {
        IO.println("Welcome to game + description of game\n");
        String name = IO.readln("What is your name? ");
        IO.println("\nHello " + name + "\nTo move around the labyrinth, type: which coordinate you want to move \n");
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

    public void attackedWithMelee() {
        IO.print("You swung the ");
    }

    public void noAmmo() {
        IO.println("You are out of ammo");
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
}
