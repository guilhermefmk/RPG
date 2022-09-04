package classes;
import Itens.Cajado;

public class Mago extends Personagem {
    private int manaatual;
    private int manatotal;
    private Cajado cajado;


    Cajado cajadoInicio = new Cajado("Cajado antigo", 3, 1, 1);

    public Mago(String nome) {
        super(nome);
        this.manaatual = 50;
        this.manatotal = 50;
        this.cajado = cajadoInicio;
        this.vidatotal = 14;
        this.vidaatual = 14;
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


   


    public int getManaatual() {
        return manaatual;
    }


    public void setManaatual(int manaatual) {
        this.manaatual = manaatual;
    }


    public int getManatotal() {
        return manatotal;
    }


    public void setManatotal(int manatotal) {
        this.manatotal = manatotal;
    }


    public Cajado getCajado() {
        return cajado;
    }


    public void setCajado(Cajado cajado) {
        this.cajado = cajado;
    }


    @Override
    public String status() {
        return this.getNome() + "\nMago\n" + "Vida -> " + this.getVidaAtual() + "/" + this.getVidatotal() + " Mana -> " + this.getManaatual() + "/" + this.getManatotal() + "\nArma -> " + this.cajado.getNome() + "\nAtk -> +" + this.cajado.getDano() + " Def -> +" + this.cajado.getDefesa() + "\nRange -> " + this.cajado.getRange() + " Nivel -> " + this.cajado.getNivel() + "\n------------------------------------------------------------";
    }



   
    
    
}