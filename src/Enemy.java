import java.util.ArrayList;


public class Enemy {
    String name;
    String description;
    int health;
    Weapon enemyWeapon;
    Room enemyRoom;


    public Enemy(String name, String description, int health, Weapon enemyWeapon, Room enemyRoom) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.enemyWeapon = enemyWeapon;
        this.enemyRoom = enemyRoom;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void attack(Player player) {
        player.hit(enemyWeapon);
    }

    public void hit(Weapon weapon) {
        health -= weapon.damage;

        if (health <= 0) {
            die();
        }
    }

    private void die() {
        enemyRoom.removeEnemy(this);
        enemyRoom.addItemToRoom(enemyWeapon);
    }

    public String toString() {
        return description + ", it has a " + enemyWeapon.description;
    }
}
