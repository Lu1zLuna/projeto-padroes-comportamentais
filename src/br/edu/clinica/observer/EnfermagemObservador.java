package br.edu.clinica.observer;

public class EnfermagemObservador implements ObservadorConsulta {
    @Override public void atualizar(EventoConsulta e) {
        if (e.estadoNovo().equals("EM_ATENDIMENTO") || e.estadoNovo().equals("CANCELADA")) {
            System.out.println("[Enfermagem] " + e.descricao());
        }
    }
}
