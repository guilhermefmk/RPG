package classes;

import Itens.Arma;

public interface Acoes {
    public abstract void equiparItem();
    public abstract void mover();
    public abstract String status();
    public abstract void atacar(Arma a);
    public abstract void defender(Arma a);
}
