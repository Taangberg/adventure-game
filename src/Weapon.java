public abstract class Weapon extends Item {

    public Weapon(String name, String description,int damage) {
        super(name, description);

    }

    public abstract boolean canUse();

    public abstract int use();

    public abstract int getammo();
}
