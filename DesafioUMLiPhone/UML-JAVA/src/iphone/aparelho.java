package iphone;

import iphone.aparelhotelefonico.TelefoneIntfc;
import iphone.navegadorinternet.NavegadorIntf;
import iphone.reprodutormusical.ReproducaoIntfc;

/**
 * Classe com Herança Múltipla.
 */
public class Aparelho implements ReproducaoIntfc, TelefoneIntfc, NavegadorIntf {


  @Override
  public void tocar() {
    System.out.println("Reproduzindo música");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada");
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
    System.out.println("Exibindo a página.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando aba.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
