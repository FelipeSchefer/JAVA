package aula05;
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //METODOS PERSONLIZADOS
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    // ABRIR E FECHAR CONTA
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.getStatus();
        if(tipo == "CC"){
            this.saldo = 50;
        }
        else if (tipo == "CP"){
            this.saldo = 150;
        }
        else{
            System.out.println("Conta aberta com sucesso!");
        }
    }
    public void fecharConta(){
        if (this.getSaldo() < 0){
            System.out.println("Saldo devedor não podes encerrar a conta");
        }
        else if(this.getSaldo() > 0){
            System.out.println("Sua conta tem saldo não podes encerra-la");
        }
        else{
            this.setStatus(false);
            System.out.println("Sua conta foi encerrada com sucesso");
        }
    }
    
    // DEPOSITOS E SAQUES
    public void depositar(float v){
        if(this.getStatus()){    
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso de "+ v +" na conta " + this.getDono()); 
        }
        else{
            System.out.println("Impossivel depositar!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso de "+ v +" na conta de " + this.getDono());
            }
            else{
                System.out.println("Não tens saldo suficiente para sacar");
            }  
        }
        else{
            System.out.println("Impossivel de sacar duma conta fechada.");
        }    
    }
    
    // COBRANÇAS MENSAIS
    public void Mensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }
        else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
        else{
            System.out.println("Impossivel pagar com uma conta fechada.");
        }
        
    }
    
    //METODOS SETTER E GETTER
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
}
