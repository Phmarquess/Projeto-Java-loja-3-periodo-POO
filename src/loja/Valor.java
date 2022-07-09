package loja;

public abstract class Valor {
    
    public String qualidade;
    public Valor(){
        qualidade="boa";
       
    }
    
    public abstract int preco();                //abistrata
    
}
