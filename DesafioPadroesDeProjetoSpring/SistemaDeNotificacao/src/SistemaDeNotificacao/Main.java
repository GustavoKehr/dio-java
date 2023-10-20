package SistemaDeNotificacao;

public class Main {
    public static void main(String[] args) {
        Sujeito sujeito = new Sujeito();

        Observador assinante1 = new Assinante("Alice");
        Observador assinante2 = new Assinante("Bob");
        Observador assinante3 = new Assinante("Charlie");
      
        sujeito.adicionarObservador(assinante1);
        sujeito.adicionarObservador(assinante2);
        sujeito.adicionarObservador(assinante3);
       
        sujeito.notificarObservadores("Novo artigo publicado!");

        
    }
}