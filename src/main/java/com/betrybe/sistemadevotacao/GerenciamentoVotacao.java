package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe responsável pelo gerenciamento da votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<String> pessoasCandidatas;
  private ArrayList<String> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * Construtor da classe GerenciamentoVotacao.
   * Inicializa as listas de pessoas candidatas, pessoas eleitoras e CPFs computados.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    // Implementação do método
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    // Implementação do método
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    // Implementação do método
  }

  @Override
  public void mostrarResultado() {
    // Implementação do método
  }
}
