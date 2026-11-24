package br.edu.clinica.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.clinica.model.Consulta;
import br.edu.clinica.observer.EventoConsulta;
import br.edu.clinica.observer.ObservadorConsulta;

public class NotificacaoService {
    private final List<ObservadorConsulta> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorConsulta obs){
        if (!observadores.contains(obs)) observadores.add(obs);
    }

    public void removerObservador(ObservadorConsulta obs) {
        observadores.remove(obs);
    }

    public void notificarMudanca(Consulta consulta, String estadoAnterior){
        var evento = new EventoConsulta(consulta, estadoAnterior, consulta.getEstado().getNome());
        for (var obs : List.copyOf(observadores)) {
            try {
                obs.atualizar(evento);
            } catch (RuntimeException ex) {
                System.out.println("[Notificacao] observador falhou: " + ex.getMessage());
            }
        }
    }
}
