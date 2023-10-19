package iphone;


public class Main {

  public static void main(String[] args) {
    Aparelho iphone = new Aparelho();

    System.out.println("------------->");
    iphone.selecionarMusica("Paradise Eve");
    iphone.tocar();
    iphone.pausar();
    System.out.println("-------------");

    System.out.println("------------->");
    iphone.atender();
    iphone.iniciarCaixaPostal();
    iphone.ligar(997164012);
    System.out.println("-------------");

    System.out.println("-------------");
    iphone.exibirPagina();
    iphone.atualizarPagina();
    iphone.adicionarNovaAba();
    System.out.println("-------------");

  }

}