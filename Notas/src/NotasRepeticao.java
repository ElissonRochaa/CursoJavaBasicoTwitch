import java.util.Scanner;

public class NotasRepeticao {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, soma, media;
        int i;
        //Laco de repeticao - for
        //for(inicio, condicao de parada, incremento)
        //i++ -> i = i + 1
        for(i=0; i<3; i++){
            System.out.println("Notas do Aluno " + (i+1));
            //pegar a nota 1
            System.out.println("Digite a primeira nota:");
            nota1 = scan.nextDouble();

            //pegar a nota 2
            System.out.println("Digite a segunda nota:");
            nota2 = scan.nextDouble();

            //calcular media
            media = (nota1 + nota2) / 2;

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
}
