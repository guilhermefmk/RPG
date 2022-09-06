package classes;
import Itens.Cajado;

public class Mago extends Personagem {


    Cajado cajadoInicio = new Cajado("Cajado antigo", 3, 1, 1);

    public Mago(String nome) {
        super(nome);
        this.setClasse("Mago");
        this.setTipoCast("Mana");
        this.setCastAtual(50);
        this.setCastTotal(50);
        this.setArma(cajadoInicio);
        this.setVidatotal(14);
        this.setVidaatual(14);
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