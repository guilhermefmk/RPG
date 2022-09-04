package classes;
import Itens.Espada;

public class Guerreiro extends Personagem {
    private int energiaatual;
    private int energiatotal;
    private Espada espada;

    Espada espadaInicial = new Espada("Espada bastarda", 3, 1, 1, 1);

    public Guerreiro(String nome) {
        super(nome);
        this.energiaatual = 20;
        this.energiatotal = 20;
        this.espada = espadaInicial;
        this.vidaatual = 20;
        this.vidatotal = 20;
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


   


    public int getEnergiaatual() {
        return energiaatual;
    }


    public void setEnergiaatual(int energiaatual) {
        this.energiaatual = energiaatual;
    }


    public int getEnergiatotal() {
        return energiatotal;
    }


    public void setEnergiatotal(int energiatotal) {
        this.energiatotal = energiatotal;
    }


    public Espada getEspadaInicial() {
        return espadaInicial;
    }


    public void setEspadaInicial(Espada espadaInicial) {
        this.espadaInicial = espadaInicial;
    }


    public Espada getEspada() {
        return espada;
    }


    public void setEspada(Espada espada) {
        this.espada = espada;
    }


    @Override
    public String status() {
        return this.getNome() + "\nGuerreiro\n" + "Vida -> " + this.getVidaAtual() + "/" + this.getVidatotal() + " Energia -> " + this.getEnergiaatual() + "/" + this.getEnergiatotal() + "\nArma -> " + this.espada.getNome() + "\nAtk -> +" + this.espada.getDano() + " Def -> +" + this.espada.getDefesa() + "\nRange -> " + this.espada.getRange() + " Nivel -> " + this.espada.getNivel() + "\n------------------------------------------------------------";
    }


    
    
}
