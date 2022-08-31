package classes;
import Itens.Cajado;

public class Mago extends Personagem {
    private int mana;
    private Cajado cajado;


    Cajado cajadoInicio = new Cajado("Cajado antigo", 3, 1, 1);

    public Mago(String nome) {
        super(nome);
        this.mana = 50;
        this.cajado = cajadoInicio;
        this.vida = 14;
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


    public int getMana() {
        return mana;
    }


    public void setMana(int mana) {
        this.mana = mana;
    }


    public Cajado getCajado() {
        return cajado;
    }


    public void setCajado(Cajado cajado) {
        this.cajado = cajado;
    }


    @Override
    public String status() {
        // TODO Auto-generated method stub
        return null;
    }


   
    
    
}