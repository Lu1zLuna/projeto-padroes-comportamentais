package br.edu.clinica.model;

public interface EstadoConsulta {
    String getNome();
    EstadoConsulta avancar();
    EstadoConsulta cancelar();
}
