import classes.*;

public class Principal {
    public static void main(String[] args) {
        Guerreiro warrior = new Guerreiro("Guilherme");
        Mago mage = new Mago("Arthur");
        Arqueiro pally = new Arqueiro("Legolas");
        Equipe pt = new Equipe(warrior, mage, pally);
        System.out.println(pt.MostraEquipe());
    }
}
