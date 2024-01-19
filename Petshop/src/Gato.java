public class Gato {
    //caracteristicas = Atributos
    private String nome;
    private int idade;
    private String cor;
    private String sexo;

    //Construtor
    //Modificador de acesso:public ou private
    public Gato(String nome){
        this.nome = nome;
    }

    public Gato(String nome, int idade, String cor, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
    }


    //Comportamentos
    //Sets (que é colocar valores nos atributos)

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    //gets (pegar os valores que estao nas variaveis).
    public int getIdade(){
        return this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCor(){
        return this.cor;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void miar(){
        System.out.println(nome + " está Miando...");
    }

    public void dormir(){
        System.out.println(nome + " está dormindo zzz");
    }

    public void comer(){
        System.out.println(nome + " está comendo...");
    }

    public void exibirGato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Sexo: " + this.sexo);
    }

    public String descreverGato(){
        return nome + "," + idade + "," + cor + "," + sexo;
    }
}
