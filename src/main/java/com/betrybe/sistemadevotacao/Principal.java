package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe responsável por executar a aplicação de votação.
 */
public class Principal {

  /**
   * Método principal.
   *
   * @param args argumentos de linha de comando
   */
  public static void main(String[] args) {
    GerenciamentoVotacao eleicao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    int option = 0;

    while (option != 2) {
      System.out.println("""
          Cadastrar pessoa candidata?
          1 - Sim
          2 - Não
          Entre com o número correspondente à opção desejada:""");
      option = scanner.nextInt();

      if (option == 1) {
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        System.out.println("Entre com o nome da pessoa candidata:");
        String candName = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candNum = scanner.nextInt();
        eleicao.cadastrarPessoaCandidata(candName, candNum);

        int eleOption = 0;
        while (eleOption != 2) {
          System.out.println("""
              Cadastrar pessoa eleitora?
              1 - Sim
              2 - Não
              Entre com o número correspondente à opção desejada:""");
          scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
          eleOption = scanner.nextInt();

          if (eleOption == 1) {
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
            System.out.println("Entre com o nome da pessoa eleitora:");
            String eleName = scanner.nextLine();
            System.out.println("Entre com o CPF da pessoa eleitora:");
            String eleCpf = scanner.nextLine();
            eleicao.cadastrarPessoaEleitora(eleName, eleCpf);
          }
        }
      }
    }

    int menuOption = 0;
    while (menuOption != 3) {
      System.out.println("""
          Entre com o número correspondente à opção desejada:
          1 - Votar
          2 - Resultado Parcial
          3 - Finalizar Votação""");
      menuOption = scanner.nextInt();

      if (menuOption == 1) {
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpfEleitora = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroCandidata = scanner.nextInt();
        eleicao.votar(cpfEleitora, numeroCandidata);
        System.out.println("Voto computado com sucesso!");
      } else if (menuOption == 2) {
        eleicao.mostrarResultado();
      }
    }

    System.out.println("Resultado Final:");
    eleicao.mostrarResultado();
  }
}
