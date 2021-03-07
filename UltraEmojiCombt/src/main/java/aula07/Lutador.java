package aula07;
public class Lutador {
    //ATRIBUTOS
    private String nome, nacionalidade, categoria;
    private float peso, altura;
    private int idade, vitorias, derrotas, empates;
    
    //MÉTODOS PUBLICOS
    public void apresentar(){
        System.out.println("---------------------------------");
        System.out.println("CHEGOUH A HORA! Apreentamos o lutador " + this.getNome());
        System.out.println("vindo diretamente de " + this.getNacionalidade() + " pesando " + this.getPeso() + " quilos");
        System.out.println("tendo " + this.getIdade() + " anos de idade e tendo " + this.getAltura() + " metros de altura.");
        System.out.println("Com " + this.vitorias + " vitorias, " + this.derrotas + " derrotas e " + this.empates + " empates.");
    }
    
    public void status(){
        System.out.println("---------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria : " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //MÉTODO CONSTRUTOR

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
   
    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
