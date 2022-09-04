package classes;
import Itens.Arco;


public class Arqueiro extends Personagem {
    private int energiaatual;
    private int energiatotal;
    private Arco arco;

    Arco ArcoInicial = new Arco("Arco comum", 2, 0, 1);

    public Arqueiro(String nome) {
        super(nome);
        this.energiaatual = 30;
        this.energiatotal = 30;
        this.arco = ArcoInicial;
        this.vidaatual = 16;
        this.vidatotal = 16;
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


    public Arco getArcoInicial() {
        return ArcoInicial;
    }


    public void setArcoInicial(Arco arcoInicial) {
        ArcoInicial = arcoInicial;
    }


    public Arco getArco() {
        return arco;
    }


    public void setArco(Arco arco) {
        this.arco = arco;
    }


    @Override
    public String status() {
        return this.getNome() + "\nArqueiro\n" + "Vida -> " + this.getVidaAtual() + "/" + this.getVidatotal() + " Energia -> " + this.getEnergiaatual() + "/" + this.getEnergiatotal() + "\nArma -> " + this.arco.getNome() + "\nAtk -> +" + this.arco.getDano() + " Def -> +" + this.arco.getDefesa() + "\nRange -> " + this.arco.getRange() + " Nivel -> " + this.arco.getNivel() + "\n------------------------------------------------------------";
    }
    
}
