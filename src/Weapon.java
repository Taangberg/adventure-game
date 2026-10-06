public abstract class Weapon extends Item {
    int damage;

    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    public abstract boolean canUse();

    public abstract int use();

    public abstract int getammo();
}
