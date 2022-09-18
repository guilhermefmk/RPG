package classes.player;
import Itens.Espada;
import classes.Personagem;

public class Guerreiro extends Personagem {
    

    Espada armaInicial = new Espada("Espada bastarda", 3, 1, 1, 1);
    
    public Guerreiro(String nome) {
        super(nome);
        super.setClasse("Guerreiro");
        super.setTipoCast("Energia");
        super.setCastAtual(20);
        super.setCastTotal(20);
        super.setArma(armaInicial);
        super.setVidaatual(20);
        super.setVidatotal(20);
        //TODO Auto-generated constructor stub
    }


    
}
