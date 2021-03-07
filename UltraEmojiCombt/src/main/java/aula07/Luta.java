package aula07;

import java.util.Random;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //MÉTODOS PUBLICOS
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equals( l2.getCategoria()) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada == true) {
            System.out.println(" ");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            
            System.out.println(" ");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println(" ");
            System.out.println("======= RESULTADO =======");
            switch (vencedor) {
                case 0: //EMPATE
                    System.out.println("Empate emtre " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: //VITORIA
                    System.out.println("Vitoria do desafiado: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2: //DERROTA
                    System.out.println("Vitoria do desafiante: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
                default:
                    throw new AssertionError();
            }
             System.out.println("=========================");
        }
        else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //MÉTODOS ESPECIAIS
}
