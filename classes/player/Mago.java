package classes.player;
import Itens.*;
import classes.Personagem;

public class Mago extends Personagem {


    Arma armaInicial = new Cajado("Cajado antigo", 3, 1, 1);

    public Mago(String nome) {
        super(nome);
        super.setClasse("Mago");
        super.setTipoCast("Mana");
        super.setCastAtual(50);
        super.setCastTotal(50);
        super.setArma(armaInicial);
        super.setVidatotal(14);
        super.setVidaatual(14);
        //TODO Auto-generated constructor stub
    }


    
}