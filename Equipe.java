import java.util.*;
import classes.*;


public class Equipe {
    protected Guerreiro guerreiro;
    protected Mago mago;
    protected Arqueiro arqueiro;
    
    public Equipe(Guerreiro guerreiro, Mago mago, Arqueiro arqueiro) {
        this.guerreiro = guerreiro;
        this.mago = mago;
        this.arqueiro = arqueiro;
    }
    public Guerreiro getGuerreiro() {
        return guerreiro;
    }
    public void setGuerreiro(Guerreiro guerreiro) {
        this.guerreiro = guerreiro;
    }
    public Mago getMago() {
        return mago;
    }
    public void setMago(Mago mago) {
        this.mago = mago;
    }
    public Arqueiro getArqueiro() {
        return arqueiro;
    }
    public void setArqueiro(Arqueiro arqueiro) {
        this.arqueiro = arqueiro;
    }

   


    
}
