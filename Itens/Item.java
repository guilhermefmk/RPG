package Itens;

public abstract class Item {
    protected String nome;
    protected int dano;
    protected int defesa;
    protected int range;
    protected int nivel;



    
    public Item(String nome, int dano, int defesa, int range, int nivel) {
        this.nome = nome;
        this.dano = dano;
        this.defesa = defesa;
        this.range = range;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public void setRange(int range){
        this.range = range;
    }
    public int getRange(){
        return range;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public int getNivel(){
        return nivel;
    }

    
}
