package classes;
import Itens.Arco;


public class Arqueiro extends Personagem {
    private int energia;
    private Arco arco;

    Arco ArcoInicial = new Arco("Arco comum", 2, 0, 1);

    public Arqueiro(String nome) {
        super(nome);
        this.energia = 30;
        this.arco = ArcoInicial;
        this.vida = 16;
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


    public int getEnergia() {
        return energia;
    }


    public void setEnergia(int energia) {
        this.energia = energia;
    }


    public Arco getArco() {
        return arco;
    }


    public void setArco(Arco arco) {
        this.arco = arco;
    }


    @Override
    public String status() {
        return nome;
        // TODO Auto-generated method stub
        
    }
    
}
