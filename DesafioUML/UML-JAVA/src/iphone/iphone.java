package iphone;

import iphone.iphonetelefone.TelefoneB;
import iphone.navegadorinternet.NavegadorB;
import iphone.reprodutordemusica.ReproducaoB;

public class Aparelho implements ReproducaoB, TelefoneB, NavegadorB {


  @Override
  public void tocar() {
    System.out.println("Ouvindo a música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a música");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação");
  }

  @Override
  public void iniciarCaixaPostal() {
    System.out.println("Caixa Postal");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }
}
