package br.edu.clinica.model;

public class Concluida implements EstadoConsulta {
    public String getNome(){ return "CONCLUIDA"; }
    public EstadoConsulta avancar(){ throw new IllegalStateException("Consulta concluida nao pode avancar."); }
    public EstadoConsulta cancelar(){ throw new IllegalStateException("Consulta concluida nao pode ser cancelada."); }
}
