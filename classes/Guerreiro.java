package classes;
import Itens.Espada;

public class Guerreiro extends Personagem {
    

    Espada espadaInicial = new Espada("Espada bastarda", 3, 1, 1, 1);
    
    public Guerreiro(String nome) {
        super(nome);
        this.setClasse("Guerreiro");
        this.setTipoCast("Energia");
        this.setCastAtual(20);
        this.setCastTotal(20);
        this.setArma(espadaInicial);
        this.setVidaatual(20);
        this.setVidatotal(20);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void equiparItem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        
    }


    
    
}
