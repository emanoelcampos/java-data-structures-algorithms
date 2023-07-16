package estrutura.dados.vetores.arrays.labs;

import estrutura.dados.vetores.arrays.teste.Contato;
import estrutura.dados.vetores.arrays.vetor.Lista;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        // 1 - Crie um vetor com capacidade para 20 contatos.
        // 2- Insira 30 contatos no vetor.
        // 3- Crie um exemplo para utilizar cada método da classe Lista.
        // A - Criação das variáveis
        // B - Criar um menu para que o usuário escolha a opção

        Lista<Contato> listaContato = new Lista<>(20);

        Scanner scan = new Scanner(System.in);

        int opcao = 1;

        while(opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1 -> adicionarContatoFinal(scan, listaContato);
                case 2 -> adicionarContatoPosicao(scan, listaContato);
                //case 3 ->
            }
        }

        System.out.println("Usuário digitou 0, programa terminado.");

        criarContatosDinamicamente(listaContato, 30);

    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criado um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso.");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criado um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", scan);

       try {
           lista.adiciona(posicao, contato);
           System.out.println("Contato adicionado com sucesso na posição: " + posicao + ".");
           System.out.println(contato);
       } catch (Exception e) {
           System.out.println("Posição inválida, contato não adicionado!");
       }
    }

    private static String leInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    private static int leInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite, novamente.");
            }

        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while(!entradaValida) {

            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final do vetor.");
            System.out.println("2: Adiciona contato em uma opção específica.");
            System.out.println("3: Obtém contato de uma posição específica.");
            System.out.println("4: Consulta contato.");
            System.out.println("5: Consulta último índice do contato.");
            System.out.println("6: Verifica se contato existe.");
            System.out.println("7: Remove por posição.");
            System.out.println("8: Excluir contato.");
            System.out.println("9: Verifica tamanho do vetor.");
            System.out.println("10: Excluir todos os contatos do vetor.");
            System.out.println("11: Imprime vetor.");
            System.out.println("0: Sair.");

            try{
                entrada =  scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                } else {
                   throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente.\n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(Lista<Contato> lista, int quantidade) {

        Contato contato;
        for(int i = 0; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato: " + i);
            contato.setTelefone("1111-111" + i);
            contato.setEmail("contato+" + i + "@email.com");
            lista.adiciona(contato);
        }
    }
}
