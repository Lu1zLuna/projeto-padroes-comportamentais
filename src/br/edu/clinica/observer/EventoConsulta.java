package br.edu.clinica.observer;

import br.edu.clinica.model.Consulta;

public record EventoConsulta(Consulta consulta, String estadoAnterior, String estadoNovo) {
    public String descricao() {
        return consulta.getPaciente().getNome() + " | " + estadoAnterior + " -> " + estadoNovo;
    }
}
