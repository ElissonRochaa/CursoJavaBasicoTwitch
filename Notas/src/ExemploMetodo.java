import java.util.Scanner;

public class ExemploMetodo {

    //Modificador de acesso: public e private.
    //tipo de retorno: Tipo de dados ou void
        //void -> metodo não retornará nada
    //Nome do Metodo: apelido
    // Parametros -> ()
    // {o escopo do metodo}

    public void cabecalho(){
        System.out.println("Curso JAVA Básico");
        System.out.println("Com Professor tico");
        System.out.println("twitch.tv/professortico");
    }

    public double calcularMedia(double n1, double n2){
        double media;
        media = (n1 + n2) / 2;
        return media;
    }

    public double solicitarNota(int i){
        Scanner scan = new Scanner(System.in);
        double nota;

        System.out.println("Digite a " + i +  "a nota:");
        nota = scan.nextDouble();
        return nota;
    }

    public static void main(String[] args){
        ExemploMetodo exemplo = new ExemploMetodo();
        exemplo.cabecalho();

        double nota1, nota2, media;

        nota1 = exemplo.solicitarNota(1);
        nota2 = exemplo.solicitarNota(2);

        media = exemplo.calcularMedia(nota1, nota2);

        //verificar minha condição
        if(media >= 7){
            //escrever aprovado
            System.out.println("Parabéns, você foi aprovado com a Media: " + media);
        }else{
            //escrever reprovado
            System.out.println("Infelizmente, você foi reprovado com a Media " + media);
        }

    }

}
