package heranca;
public class index {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Pedro");
        p.setIdade(28);
        p.setSexo("M");
        
        Aluno a = new Aluno();
        a.setNome("Franciele");
        a.setIdade(18);
        a.setSexo("F");
        a.setCurso("Informática");
        
        Professor pf = new Professor();
        pf.setNome("Cláudio");
        pf.setIdade(22);
        pf.setSexo("F");
        pf.setSalario(3599.75f);
        
        Funcionario f = new Funcionario();
        f.setNome("Fabiana");
        f.setIdade(25);
        f.setSexo("F");
        f.setSetor("Estoque");
        
        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(pf.toString());
        System.out.println(f.toString());
        
    }
}
