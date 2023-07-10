package com.betrybe.sistemadevotacao;

/**
 * Classe que representa uma pessoa candidata em um sistema de votação.
 */
public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome   O nome da pessoa candidata.
   * @param numero O número de identificação da pessoa candidata.
   */
  public PessoaCandidata(String nome, int numero) {
    this.votos = 0;
    this.numero = numero;
    setNome(nome);
  }

  /**
   * Obtém o número de identificação da pessoa candidata.
   *
   * @return O número de identificação.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Define o número de identificação da pessoa candidata.
   *
   * @param numero O número de identificação.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Obtém o nome da pessoa candidata.
   *
   * @return O nome da pessoa candidata.
   */
  public String getNome() {
    return super.getNome();
  }

  /**
   * Define o nome da pessoa candidata.
   *
   * @param nome O nome da pessoa candidata.
   */
  public void setNome(String nome) {
    super.setNome(nome);
  }

  /**
   * Obtém a quantidade de votos recebidos pela pessoa candidata.
   *
   * @return A quantidade de votos recebidos.
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Incrementa o número de votos recebidos pela pessoa candidata.
   */
  public void receberVoto() {
    this.votos += 1;
  }

  /**
   * Define a quantidade de votos recebidos pela pessoa candidata.
   *
   * @param votos A quantidade de votos recebidos.
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }
}
