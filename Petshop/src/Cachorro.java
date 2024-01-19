public class Cachorro {
    //Caracteristicas -> Atributos
    //modificador de acesso: public ou private
    //tipo do atributo
    //apelido;
    private String nome;
    private int idade;
    private String raca;
    private String cor;
    private String porte;
    private String sexo;
    private boolean estaDormindo;

    //construtor
    public Cachorro(String nome){
        this.nome = nome;
        this.estaDormindo = false;
    }

    public Cachorro(String nomeDoCachorro, String corDoCachorro){
        this.nome = nomeDoCachorro;
        this.cor = corDoCachorro;
        this.estaDormindo = false;
    }

    public Cachorro(String nome, int idade, String raca, String cor, String porte, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cor = cor;
        this.porte = porte;
        this.sexo = sexo;
        this.estaDormindo = false;
    }

    //Comportamentos -> Metodos
    //sets e gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void latir(){
        System.out.println(nome + " está latindo...");
    }

    public void dormir(){
        System.out.println(nome + " está dormindo zzz");
        this.estaDormindo = true;
    }

    public void acordar(){
        this.estaDormindo = false;
        System.out.println(nome + " acordou...");
    }

    public void comer(){
        if(this.estaDormindo==false){
            System.out.println(nome + " está comendo...");
        }else{
            System.out.println(nome + " não pode comer, pois está dormindo...");
        }
    }

    public void exibirCachorro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Idade: " + this.idade);
        System.out.println("Porte: " + this.porte);
        System.out.println("Raça: " + this.raca);
        System.out.println("Sexo: " + this.sexo);
    }

    public String descreverCachorro(){
        return nome + "," + idade + "," + cor + "," + porte + "," + raca + "," + sexo;
    }
}
