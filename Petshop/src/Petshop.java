import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Petshop {
    public Gato criarGato(Scanner scan){
        String nome, cor, sexo;
        int idade;

        System.out.println();
        System.out.println("Digite o nome do gato:");
        nome = scan.nextLine();
        System.out.println("Qual a idade do gato:");
        idade = Integer.parseInt(scan.nextLine());
        //idade = scan.nextInt();
        //scan.nextLine();
        System.out.println("Qual a cor do gato:");
        cor = scan.nextLine();
        System.out.println("Qual o sexo do gato:");
        sexo = scan.nextLine();

        Gato gato = new Gato(nome, idade, cor, sexo);

        return gato;
    }

    public Cachorro criarCachorro(Scanner scan){
        String nome, cor, sexo, raca, porte;
        int idade;

        System.out.println("Digite o nome do cachorro:");
        nome = scan.nextLine();
        System.out.println("Qual a idade do cachorro:");
        idade = Integer.parseInt(scan.nextLine());
        //idade = scan.nextInt();
        //scan.nextLine();
        System.out.println("Qual a cor do cachorro:");
        cor = scan.nextLine();
        System.out.println("Qual o sexo do cachorro:");
        sexo = scan.nextLine();
        System.out.println("Qual a raça do cachorro:");
        raca = scan.nextLine();
        System.out.println("Qual o porte do cachorro:");
        porte = scan.nextLine();


        Cachorro cachorro = new Cachorro(nome, idade, raca, cor, porte, sexo);

        return cachorro;
    }

    public void cabecalho(){
        System.out.println("Bem vindo ao PetShop TICO");
        System.out.println("Cuidado que seu pet merece");
        System.out.println("Veja ele ao vivo no twitch.tv/professortico");
    }

    public void salvarGatos(List<Gato> gatos){
        String arquivo = "arquivos/gatos.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            for(int i = 0; i<gatos.size(); i++){
                writer.write(gatos.get(i).descreverGato());
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void salvarCachorros(List<Cachorro> cachorros){
        String arquivo = "arquivos/cachorros.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            for(int i = 0; i<cachorros.size(); i++){
                writer.write(cachorros.get(i).descreverCachorro());
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Gato> lerGatos(){
        String arquivo = "arquivos/gatos.txt";
        List<Gato> gatos = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;

            //Nino,2,Cinza,Macho
            //nome,idade,cor,sexo
            while((linha = reader.readLine())!=null){
                String[] dadosGato = linha.split(",");
                String nome = dadosGato[0];
                int idade = Integer.parseInt(dadosGato[1]);
                String cor = dadosGato[2];
                String sexo = dadosGato[3];

                Gato gato = new Gato(nome, idade, cor, sexo);
                gatos.add(gato);
            }
            return gatos;

        }catch (IOException e){
            e.printStackTrace();
            return gatos;
        }
    }

    public List<Cachorro> lerCachorros(){
        String arquivo = "arquivos/cachorros.txt";
        List<Cachorro> cachorros = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = reader.readLine())!=null){
                //nome idade cor porte raca sexo;
                String[] dadosCachorro = linha.split(",");
                String nome = dadosCachorro[0];
                int idade = Integer.parseInt(dadosCachorro[1]);
                String cor = dadosCachorro[2];
                String porte = dadosCachorro[3];
                String raca = dadosCachorro[4];
                String sexo = dadosCachorro[5];

                Cachorro cachorro = new Cachorro(nome, idade, raca, cor, porte, sexo);
                cachorros.add(cachorro);
            }

            return cachorros;
        }catch (IOException e){
            e.printStackTrace();
            return cachorros;
        }
    }

    public void menuPrincipal(){
        //Vou precisar pedir as informações para o usuario
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean continuar = true;
        cabecalho();

        List<Cachorro> cachorros = lerCachorros();
        List<Gato> gatos = lerGatos();

        //listas
        //adicionar
        //cachorros.add()
        //remover
        //cachorros.remove()
        //quantidade de cachorros na lista
        //cachorros.size();

        while(continuar) {
            System.out.println("Seja bem-vindo");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar Gato");
            System.out.println("2- Cadastrar Cachorro");
            System.out.println("3- Quantidade de gatos cadastrados");
            System.out.println("4- Quantidade de cachorros cadastrados");
            System.out.println("5- Listar gatos");
            System.out.println("6- Listar cachorros");
            System.out.println("9- Sair do programa");
            System.out.print("Sua escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                Gato gato = criarGato(scan);
                gato.exibirGato();
                gatos.add(gato);
            } else if (opcao == 2) {
                Cachorro cachorro = criarCachorro(scan);
                cachorro.exibirCachorro();
                cachorros.add(cachorro);
            } else if (opcao == 3) {
                System.out.println("Quantidade de gatos cadastrados " + gatos.size());
            } else if (opcao == 4) {
                System.out.println("Quantidade de cachorros cadastrados " + cachorros.size());
            }else if(opcao == 5){
                if(gatos.size()>0){
                    for(int i = 0; i<gatos.size();i++){
                        gatos.get(i).exibirGato();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println();
                }else{
                    System.out.println("Olha, ainda não foi cadastrado nenhum gato");
                }
            }else if(opcao == 6){
                if(cachorros.size()>0){
                    for(int i = 0; i<cachorros.size();i++){
                        cachorros.get(i).exibirCachorro();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println();
                }else{
                    System.out.println("Olha, ainda não foi cadastrado nenhum cachorro");
                }
            }else if(opcao == 9){
                continuar = false;
                salvarGatos(gatos);
                salvarCachorros(cachorros);
            }else {
                System.out.println("Opção invalida...");
            }
        }
    }
}
