package aula14;
public class Gafanhoto extends Pessoa{
    private String login;
    private int TotalAssistido;

    public Gafanhoto( String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.TotalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return TotalAssistido;
    }

    public void setTotalAssistido(int TotalAssistido) {
        this.TotalAssistido = TotalAssistido;
    }

    @Override
    public String toString() {
        return " Gafanhoto{ " + super.toString() + "\nlogin= " + login + ", TotalAssistido= " + TotalAssistido + '}';
    }
    
    
    
    
}
