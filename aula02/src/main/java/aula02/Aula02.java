package aula02;

public class Aula02 {
    public static void main (String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("--------------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.cor = "Verde";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.tampada = true;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        
    }
    
}
