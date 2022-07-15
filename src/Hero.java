public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero (int health, int damage, String superPower){

    }
    public Hero (int health, int damage){

    }


    public void setHealth(int health){
        this.health=health;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
