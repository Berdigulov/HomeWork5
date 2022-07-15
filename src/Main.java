import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(500);
        boss1.setDamage(60);
        boss1.setTypeOfDefense("Magician");
        System.out.println("Boss's health: " + boss1.getHealth());
        System.out.println("Boss's damage: " + boss1.getDamage());
        System.out.println("Type of defense of Boss: " + boss1.getTypeOfDefense());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + createHeroes()[i].getDamage() +
                    createHeroes()[i].getSuperPower());

        }

    }

    public static Hero[] createHeroes(){
        Hero wizard = new Hero (150,50);
        Hero warrior = new Hero (200, 45,"Rampage");
        Hero doctor = new Hero (160 ,0,"Healing");
        Hero heroes [] = new Hero[] {warrior,wizard,doctor};
        return heroes;
    }
}