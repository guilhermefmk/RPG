package classes;
import Itens.Arco;


public class Arqueiro extends Personagem {

    

    Arco ArcoInicial = new Arco("Arco comum", 2, 0, 1);

    public Arqueiro(String nome) {
        super(nome);
        this.setClasse("Arqueiro");
        this.setTipoCast("Energia");
        this.setCastAtual(30);
        this.setCastTotal(30);
        this.setArma(ArcoInicial);
        this.setVidaatual(16);
        this.setVidatotal(16);
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
