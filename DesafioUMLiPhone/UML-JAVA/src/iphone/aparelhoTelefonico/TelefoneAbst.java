package iphone.aparelhotelefonico;

public abstract class TelefoneAbst implements TelefoneIntfc {

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação");
  }

  @Override
  public void iniciarCaixaPostal() {
    System.out.println("Caixa Postal");
  }
}
