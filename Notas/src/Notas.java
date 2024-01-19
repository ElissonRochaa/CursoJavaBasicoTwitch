import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, soma, media;
        double nota;

        //pegar a nota 1
        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextDouble();
        //System.out.println("Nota 1: " + nota1);

        //pegar a nota 2
        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextDouble();
        //System.out.println("Nota 2: " + nota2);

        //calcular media
        //primeira forma
        soma = nota1 + nota2;
        //System.out.println("Soma: " + soma);
        media = soma/2;

        //segunda forma
        media = (nota1 + nota2) / 2;

        //verificar minha condição
        //Qual minha codicao?
        // Media maior ou igual a 7
        //boolean condicao = media >= 7;
        if(media >= 7){
            //escrever aprovado
            System.out.println("Parabéns, você foi aprovado com a Media: " + media);
        }else{
            //escrever reprovado
            System.out.println("Infelizmente, você foi reprovado com a Media " + media);
        }

        scan.close();
    }
}
