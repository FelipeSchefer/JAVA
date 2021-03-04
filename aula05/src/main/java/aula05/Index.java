package aula05;
public class Index {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(111);
        Banco p2 = new Banco();
        p1.setDono("Felipe");
        p2.setNumConta(222);
        p1.abrirConta("CP"); // recebe 150 reais by default
        p2.setDono("Creuza");
        p1.setStatus(true);
        p2.abrirConta("CC"); // recebe 50 reaos nu default
        p1.depositar(500);
        p2.setStatus(true);
        p2.depositar(120);
        p1.sacar(150);
        p2.sacar(70);
        p1.fecharConta();
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
