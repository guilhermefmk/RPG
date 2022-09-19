package classes.monsters;

import Itens.Espada;
import classes.Personagem;

public class Orc extends Personagem {

    Espada armaInicial = new Espada("Punhos", 2, 0, 1, 1);

    public Orc(String nome) {
        super(nome);
        super.setClasse("Orc");
        super.setTipoCast("Energia");
        super.setCastAtual(30);
        super.setCastTotal(30);
        super.setArma(armaInicial);
        super.setVidatotal(22);
        super.setVidaatual(22);
        //TODO Auto-generated constructor stub
    }
 
}
