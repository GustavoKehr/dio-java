package SistemaDeNotificacao;

import java.util.ArrayList;
import java.util.List;

class Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String conteudo) {
        for (Observador observador : observadores) {
            observador.atualizar(conteudo);
        }
    }
}
interface Observador {
    void atualizar(String conteudo);
}





