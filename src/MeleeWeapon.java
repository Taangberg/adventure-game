public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String name, String description, int damage) {
        super(name, description, damage);
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public int use() {
        return -1;
    }

    @Override
    public int getammo() {
        return -1;
    }

}
