package iphone.aparelhotelefonico;

public abstract class TelefoneA implements TelefoneB {

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação ");
  }

  @Override
  public void iniciarCaixaPostal() {
    System.out.println("Caixa Postal ");
  }
}
