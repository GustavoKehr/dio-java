package SistemaDeNotificacao;

public class Assinante implements Observador {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String conteudo) {
        System.out.println(nome + " recebeu uma nova notificação: " + conteudo);
    }
}
