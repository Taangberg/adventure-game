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
        this.enemyWeapon=enemyWeapon;
        this.enemyRoom=enemyRoom;
    }
}
