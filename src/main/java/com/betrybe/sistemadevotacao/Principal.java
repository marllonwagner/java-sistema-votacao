package com.betrybe.sistemadevotacao;

public class Principal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
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

    votacao.votar("123",20);
    votacao.votar("124",21);

    votacao.mostrarResultado();
  }

}
