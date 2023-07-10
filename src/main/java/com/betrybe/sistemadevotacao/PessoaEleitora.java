package com.betrybe.sistemadevotacao;

/**
 * Classe que representa uma pessoa eleitora em um sistema de votação.
 */
public class PessoaEleitora extends Pessoa {

  private String cpf;

  /**
   * Construtor da classe PessoaEleitora.
   *
   * @param nome O nome da pessoa eleitora.
   * @param cpf  O CPF (Cadastro de Pessoa Física) da pessoa eleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.cpf = cpf;
    setNome(nome);
  }

  /**
   * Obtém o CPF (Cadastro de Pessoa Física) da pessoa eleitora.
   *
   * @return O CPF da pessoa eleitora.
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Define o CPF (Cadastro de Pessoa Física) da pessoa eleitora.
   *
   * @param cpf O CPF da pessoa eleitora.
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  /**
   * Obtém o nome da pessoa eleitora.
   *
   * @return O nome da pessoa eleitora.
   */
  public String getNome() {
    return super.getNome();
  }

  /**
   * Define o nome da pessoa eleitora.
   *
   * @param nome O nome da pessoa eleitora.
   */
  public void setNome(String nome) {
    super.setNome(nome);
  }
}
