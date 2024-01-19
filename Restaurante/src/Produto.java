public class Produto {
    private String nome;
    private double valorUnitario;
    private String descricao;

    //construtor
    public Produto(String nome, double valorUnitario, String descricao){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
    }

    public Produto(String nome, double valorUnitario){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.descricao = "Sem descrição";
    }


    //sets
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //gets
    public String getNome(){
        return this.nome;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    public String getDescricao(){
        return this.descricao;
    }


}
