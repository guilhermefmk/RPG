
import classes.player.Arqueiro;
import classes.player.Guerreiro;
import classes.player.Mago;

import  java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeGuerreiro, nomeMago, nomeArqueiro;
        System.out.println("Qual o nome do guerreiro?");
        nomeGuerreiro = in.next();
        System.out.println("Qual o nome do mago?");
        nomeMago = in.next();
        System.out.println("Qual o nome do Arqueiro?");
        nomeArqueiro = in.next();
        Guerreiro warrior = new Guerreiro(nomeGuerreiro);
        Mago mage = new Mago(nomeMago);
        Arqueiro pally = new Arqueiro(nomeArqueiro);
        Equipe pt = new Equipe(warrior, mage, pally);
        System.out.println(pt.MostraEquipe());
        in.close();
    }
}
