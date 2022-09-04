package classes;
public abstract class Personagem implements Acoes {
    protected String nome;
    protected int vidaatual;
    protected int vidatotal;
    
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

    public int getVidaAtual() {
        return vidaatual;
    }

    public void setVidaAtual(int vidaatual) {
        this.vidaatual = vidaatual;
    }

    public int getVidatotal() {
        return vidatotal;
    }

    public void setVidatotal(int vidatotal) {
        this.vidatotal = vidatotal;
    }

    
    
    
}