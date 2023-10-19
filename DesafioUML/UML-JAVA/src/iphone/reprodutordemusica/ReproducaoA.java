package iphone.reprodutordemusica;

public abstract class ReproducaoA implements ReproducaoB {

  protected String nome;

  public ReproducaoA(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar() {
    System.out.println("tocando " + nome);
  }

  @Override
  public void pausar() {
    System.out.println(nome + " pausada");
  }

  @Override
  public void selecionarMusica(String nome) {
    this.nome = nome;
    System.out.println(nome + " selecionada");
  }

  public String getNome() {
    return nome;
  }
}
