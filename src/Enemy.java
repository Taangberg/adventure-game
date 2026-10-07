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

//    public ArrayList<Enemy> getEnemy(String name) {
//        return enemyRoom.;
//    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void enemyAttack(Player player) {
        enemyWeapon.use();
        player.setHealth(player.getHealth() - enemyWeapon.damage);
    }

    public void enemyHit() {
        if (health == 0) {

        }
    }

    public String toString() {
        return description + ", it has a " + enemyWeapon.description;
    }
}
