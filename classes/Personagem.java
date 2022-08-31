package classes;
public abstract class Personagem implements Acoes {
    protected String nome;
    protected int vida;
    
    
    // CONSTRUCTOR
    public Personagem(String nome) {
        this.nome = nome;
    }

    // MÉTODOS

    



    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    
    
}