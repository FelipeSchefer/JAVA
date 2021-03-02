package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; 
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("carga " + this.carga);
        System.out.println("tampada " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não podes rabiscar");            
        }
        else{
            System.out.println("Estás rabiscando!");
        }
    }     
    /*Tanto os metodos public e protected podem ser acessados
    por fora da classe mesmo se o atributo seja privado*/
    protected void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
