package classes;

import Itens.Arma;

public abstract class Personagem implements Acoes {
    protected String nome;
    protected int vidaatual;
    protected int vidatotal;
    protected int exp = 0;
    protected String classe;
    protected String tipoCast;
    protected int castAtual;
    protected int castTotal;
    protected Arma arma;
    protected int level = 0;
    
    
    // CONSTRUCTOR
    public Personagem(String nome) {
        this.nome = nome;
    }

    // MÉTODOS

    public String status(){
        return this.getNome() + "\n" + this.getClasse() + "\nLevel -> " + this.getLevel() + " Exp ->" + this.getExp() + "\n" + "Vida -> " + this.getVidaatual() + "/" + this.getVidatotal() + " " + this.getTipoCast() + " -> " + this.getCastAtual() + "/" + this.getCastTotal() + this.arma.statsArma();
    }



    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVidatotal() {
        return vidatotal;
    }

    public void setVidatotal(int vidatotal) {
        this.vidatotal = vidatotal;
    }

    public int getVidaatual() {
        return vidaatual;
    }

    public void setVidaatual(int vidaatual) {
        this.vidaatual = vidaatual;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTipoCast() {
        return tipoCast;
    }

    public void setTipoCast(String tipoCast) {
        this.tipoCast = tipoCast;
    }

    public int getCastAtual() {
        return castAtual;
    }

    public void setCastAtual(int castAtual) {
        this.castAtual = castAtual;
    }

    public int getCastTotal() {
        return castTotal;
    }

    public void setCastTotal(int castTotal) {
        this.castTotal = castTotal;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    
    
    
    
}