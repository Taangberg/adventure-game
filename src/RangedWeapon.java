public class RangedWeapon extends Weapon {
    int ammo;

    public RangedWeapon(String name, String description, int ammo) {
        super(name, description);
        this.ammo = ammo;
    }

    @Override
    public boolean canUse() {
        return ammo > 0;
    }

    @Override
    public int use(){
        ammo--;
        return ammo;
    }
    @Override
    public int getammo(){
        return ammo;
    }
}
