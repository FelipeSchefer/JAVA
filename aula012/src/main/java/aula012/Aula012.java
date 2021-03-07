package aula012;
public class Aula012 {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        System.out.println(m.toString());       
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        //////////////////////////////////////
        
        Cobra c = new Cobra();
        c.locomover();
        
        Tartaruga t = new Tartaruga();
        t.locomover();
        
        Goldfish g = new Goldfish();
        g.locomover();
        
        Arara ar = new Arara();
        ar.locomover();
        
    }
}
