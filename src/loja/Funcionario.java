
package loja;

public class Funcionario extends Pessoa {             //Herança
    private int matricula;
    private Departamento departamento;                //Associação
        
    public Funcionario(){
        
    }
    public void setMatricula(int novo ){
       matricula=novo;
    }
    
    public int getMatricula(){
        return matricula;
    }   

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}

