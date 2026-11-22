package br.edu.clinica.observer;

public class AuditoriaObservador implements ObservadorConsulta {
    @Override public void atualizar(EventoConsulta e) {
        System.out.println("[Auditoria] evento registrado: " + e.descricao());
    }
}
