package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata que representa uma pessoa.
 */
public abstract class Pessoa {

  private String nome;

  /**
   * Obtém o nome da pessoa.
   *
   * @return O nome da pessoa.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define o nome da pessoa.
   *
   * @param nome O nome da pessoa.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
