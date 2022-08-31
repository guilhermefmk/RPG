package classes;
import Itens.Espada;

public class Guerreiro extends Personagem {
    private int energia;
    private Espada espada;

    Espada espadaInicial = new Espada("Espada bastarda", 3, 1, 1, 1);

    public Guerreiro(String nome) {
        super(nome);
        this.energia = 20;
        this.espada = espadaInicial;
        this.vida = 20;
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


    public Espada getEspada() {
        return espada;
    }


    public void setEspada(Espada espada) {
        this.espada = espada;
    }


    @Override
    public String status() {
        return this.getNome() + "\nGuerreiro\n" + "Vida -> " + this.getVida() + "/20\nArma -> " + this.espada.getNome();
    }


    
    
}
