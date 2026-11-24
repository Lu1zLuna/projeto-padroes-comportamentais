package br.edu.clinica.service;

import br.edu.clinica.model.Consulta;

public class EstadoConsultaService {

    public void avancar(Consulta c){
        // PADRÃO SUGERIDO: STATE
        // Ideia: encapsular cada estado como classe (Agendada, EmAtendimento, Concluida, Cancelada)
        // com transições válidas via método "avancar/cancelar".
        try {
            c.avancar();
            System.out.println("[Service] Estado => " + c.getEstado().getNome());
        } catch (IllegalStateException e) {
            System.out.println("[Service] Bloqueio => " + e.getMessage());
        }
    }

    public void cancelar(Consulta c){
        try {
            c.cancelar();
            System.out.println("[Service] Estado => " + c.getEstado().getNome());
        } catch (IllegalStateException e) {
            System.out.println("[Service] Bloqueio => " + e.getMessage());
        }
    }
}
