package loja;

import java.util.ArrayList;


public class Computador extends Valor {
    
    private String configuracoes;
    private int valor;
    ArrayList<Computador>ListaPC;
    
    
    public Computador(){
        ListaPC = new ArrayList();
    }
    
    public Computador(int valor, String configuracoes){
        this.configuracoes =configuracoes;
        this.valor = valor;
        ListaPC = new ArrayList();
    }
    
    public int preco(){               // abstrata
        return valor;
    }
    
    
    public void setConfiguracoes( String novo){
        configuracoes = novo;
    }
    public String getConfiguracaoes(){
        return configuracoes;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getConfiguracoes() {
        return configuracoes;
    }

    public int getValor() {
        return valor;
    }
    
    

    public ArrayList<Computador> getListaPC() {
        return ListaPC;
    }

    public void setListaPC(ArrayList<Computador> ListaPC) {
        this.ListaPC = ListaPC;
    }
    public void addPC(Computador F){
        F.setConfiguracoes(this.configuracoes);
        ListaPC.add(F);
    }

   
}
