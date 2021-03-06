package com.mycompany.aula011;
public class Aula011 {
    public static void main(String[] args){
       Visitante v = new Visitante();
       v.setNome("Juvenal");
       v.setIdade(22);
       v.setSexo("M");
       System.out.println(v.toString());
       
       Aluno a = new Aluno();
       a.setNome("Cláudio");
       a.setIdade(16);
       a.setSexo("M");
       a.setMatricula(1111);
       a.pagarMensalidade();
       System.out.println(a.toString());
        
       Bolsista b = new Bolsista();
       b.setNome("Jubileu");
       b.setIdade(17);
       b.setSexo("M");
       b.setBolsa(12.5f);
       b.pagarMensalidade();
       System.out.println(b.toString());
    }
}
