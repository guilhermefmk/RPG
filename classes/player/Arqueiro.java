package classes.player;
import Itens.Arco;
import Itens.*;
import classes.Personagem;


public class Arqueiro extends Personagem {

    

    Arma armaInicial = new Arco("Arco comum", 2, 0, 1);

    public Arqueiro(String nome) {
        super(nome);
        super.setClasse("Arqueiro");
        super.setTipoCast("Energia");
        super.setCastAtual(30);
        super.setCastTotal(30);
        super.setArma(armaInicial);
        super.setVidaatual(16);
        super.setVidatotal(16);
        //TODO Auto-generated constructor stub
    }

 
}
