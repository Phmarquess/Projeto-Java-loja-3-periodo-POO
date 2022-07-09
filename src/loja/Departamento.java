
package loja;

import java.util.ArrayList;

public class Departamento {
    
      private int codigo;
      private String nome;
      ArrayList<Funcionario> ListaFunc;                   //ArrayList
      
        
    public Departamento(){                                 // Polimorfismo
        ListaFunc= new ArrayList();
    }
    public Departamento(int codigo, String Nome){          // Polimorfismo
        this.codigo= codigo;
        this.nome = Nome;
        ListaFunc= new ArrayList();
    }
    public void setCodigo(int novo ){
       codigo=novo;
    }
    
    public int getCodigo(){
        return codigo;
    } 
    public void setNome(String novo ){
       nome=novo;
    }
    
    public String getNome(){
        return nome;
    } 

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    public void addFunc (Funcionario F){
        F.setDepartamento(this);
        ListaFunc.add(F);
    }
    
    
}
