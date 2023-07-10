package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe responsável pelo gerenciamento da votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  public ArrayList<PessoaCandidata> pessoasCandidatas;
  public ArrayList<PessoaEleitora> pessoasEleitoras;
  public ArrayList<String> cpfsComputados;

  /**
   * Construtor da classe GerenciamentoVotacao.
   * Inicializa as listas de pessoas candidatas, pessoas eleitoras e CPFs computados.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  /**
   * Cadastra uma pessoa candidata com o nome e número especificados.
   *
   * @param nome   o nome da pessoa candidata
   * @param numero o número da pessoa candidata
   */
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);

    if (pessoasCandidatas.stream().anyMatch(p -> p.getNumero() == numero)) {
      System.out.println("Número da pessoa candidata já utilizado!");
    } else {
      pessoasCandidatas.add(candidato);
    }
  }

  /**
   * Cadastra uma pessoa eleitora com o nome e CPF especificados.
   *
   * @param nome o nome da pessoa eleitora
   * @param cpf  o CPF da pessoa eleitora
   */
  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora eleitora = new PessoaEleitora(nome, cpf);

    if (pessoasEleitoras.stream().anyMatch(pessoaEleitora -> pessoaEleitora.getCpf().equals(cpf))) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      pessoasEleitoras.add(eleitora);
    }
  }

  /**
   * Registra o voto de uma pessoa eleitora para uma pessoa candidata específica.
   *
   * @param cpfPessoaEleitora     o CPF da pessoa eleitora
   * @param numeroPessoaCandidata o número da pessoa candidata
   */
  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.stream().anyMatch(cpf -> cpf.equals(cpfPessoaEleitora))) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    PessoaCandidata candidato = pessoasCandidatas.stream()
        .filter(c -> c.getNumero() == numeroPessoaCandidata)
        .toList()
        .get(0);
    candidato.receberVoto();
    cpfsComputados.add(cpfPessoaEleitora);
  }

  /**
   * Mostra o resultado da votação, exibindo o número de votos recebidos por cada pessoa candidata.
   */
  @Override
  public void mostrarResultado() {
    int total = cpfsComputados.size();
    if (total == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    for (PessoaCandidata pessoasCandidata : pessoasCandidatas) {
      String nome = pessoasCandidata.getNome();
      int votos = pessoasCandidata.getVotos();
      int porcentagem = (100 * votos) / total;
      System.out.println("Nome: " + nome + " - " + votos
          + " votos" + " ( " + porcentagem + "%" + " )");
    }

    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
