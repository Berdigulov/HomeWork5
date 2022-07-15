public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(500);
        boss1.setDamage(60);
        boss1.setTypeOfDefense("Magician");
        System.out.println("Boss's health: " + boss1.getHealth());
        System.out.println("Boss's damage: " + boss1.getDamage());
        System.out.println("Type of defense of Boss: " + boss1.getTypeOfDefense());
    }
}