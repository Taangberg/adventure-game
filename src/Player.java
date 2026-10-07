import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private int health = 100;
    private int maxHealth = 100;
    private Weapon equipedWeapon;
    ArrayList<Item> inventory;


    public Player(Room firstRoom) {
        this.currentRoom = firstRoom;
        this.inventory = new ArrayList<>();

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Weapon getEquipedWeapon() {
        return equipedWeapon;
    }

    public Item findItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public EatResult eat(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            if (item instanceof Food food) {
                inventory.remove(item);
                health += food.getHealthPoints();
                if (health > 100) {
                    health = maxHealth;
                }
                return EatResult.EATEN;
            }
            return EatResult.NOT_FOOD;
        }
        Item roomItem = currentRoom.findItem(itemName);
        if (roomItem != null) {
            if (roomItem instanceof Food food) {
                currentRoom.items.remove(roomItem);
                health += food.getHealthPoints();
                if (health > 100) {
                    health = maxHealth;
                }
                return EatResult.EATEN;
            }
            return EatResult.NOT_FOOD;
        }
        return EatResult.NOT_FOUND;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }

    public void showHealth() {
        if (health > 75) {
            IO.println("Health: " + health + " - You're in perfect health");
        } else if (health >= 35) {
            IO.println("Health: " + health + " - Your health is getting low");
        } else if (health >= 1) {
            IO.println("Health: " + health + " - You're nearing death");
        }
    }

    public Equip equip(String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            if (item instanceof Weapon weapon) {
                equipedWeapon = weapon;
                return Equip.EQUIPPED;
            }
            return Equip.NOT_WEAPON;
        }
        return Equip.NOT_FOUND;
    }

    public boolean attack(Enemy enemy) {
        if (equipedWeapon == null) {
            return false;
        }
        if (equipedWeapon.canUse()) {
            equipedWeapon.use();
            enemy.setHealth(enemy.getHealth() - equipedWeapon.damage);
            return true;
        }
        return false;
    }

    public void hit() {

    }

    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        }
        currentRoom = currentRoom.getNorth();
        return true;
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        }
        currentRoom = currentRoom.getSouth();
        return true;
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;
        }
        currentRoom = currentRoom.getEast();
        return true;
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        }
        currentRoom = currentRoom.getWest();
        return true;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public Item removeItem(String itemName) {
        for (int i = 0; i < inventory.size(); i++) {
            Item item = inventory.get(i);

            if (item.getName().equalsIgnoreCase(itemName)) {
                inventory.remove(i);
                return item;
            }
        }
        return null;
    }
}
