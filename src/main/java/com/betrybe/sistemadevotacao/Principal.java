package com.betrybe.sistemadevotacao;

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
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    System.out.println("CADASTRO CANDIDATO");
    System.out.println(votacao.pessoasCandidatas.size());
    votacao.cadastrarPessoaCandidata("sunda", 20);
    System.out.println(votacao.pessoasCandidatas.size());
    votacao.cadastrarPessoaCandidata("birunda", 21);
    System.out.println(votacao.pessoasCandidatas.size());
    votacao.cadastrarPessoaCandidata("geronimo", 21);
    System.out.println(votacao.pessoasCandidatas.size());

    votacao.cadastrarPessoaEleitora("jurandir", "123");
    votacao.cadastrarPessoaEleitora("jurandir", "124");

    votacao.votar("123", 20);
    votacao.votar("124", 21);

    votacao.mostrarResultado();
  }

}
