public class RangedWeapon extends Weapon {
    int ammo;

    public RangedWeapon(String name, String description, int ammo) {
        super(name, description);
        this.ammo = ammo;
    }

    @Override
    public boolean canUse() {
        if (ammo > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int use(){
        return ammo -=1;
    }
}
