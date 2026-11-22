package br.edu.clinica.observer;

public class FarmaciaObservador implements ObservadorConsulta {
    @Override public void atualizar(EventoConsulta e) {
        if (e.estadoNovo().equals("CONCLUIDA")) {
            System.out.println("[Farmacia] separar medicação — " + e.descricao());
        }
    }
}