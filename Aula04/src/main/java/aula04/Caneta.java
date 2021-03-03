package aula04;
public final class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    /*
    *METODO CONSTRUCTOR
    */
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);//também pode ser "this.ponta = p;"
        this.tampar();
    }
    /*
    *METODO ACESSOR GETTER & SETTER
    */
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
        
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    /*
     METODOS DA CANETA 
    */
    
    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("--------------------------");
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
