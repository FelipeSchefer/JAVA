package heranca;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum){
        this.salario += aum;
    }
    
    //MÉTODO ESPECIAL
    //ESPECIALIDADE
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //SALARIO
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
