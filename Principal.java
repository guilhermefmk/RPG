import classes.*;

public class Principal {
    public static void main(String[] args) {
        Guerreiro warrior = new Guerreiro("Guilherme");
        System.out.println(warrior.status());
        Mago mage = new Mago("Arthur");
        System.out.println(mage.status());
        Arqueiro pally = new Arqueiro("Legolas");
        System.out.println(pally.status());
        Equipe pt = new Equipe(warrior, mage, pally);
    }
}
