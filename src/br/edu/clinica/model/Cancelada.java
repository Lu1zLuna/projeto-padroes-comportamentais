package br.edu.clinica.model;

public class Cancelada implements EstadoConsulta {
    public String getNome(){ return "CANCELADA"; }
    public EstadoConsulta avancar(){ throw new IllegalStateException("Consulta cancelada nao pode avancar."); }
    public EstadoConsulta cancelar(){ throw new IllegalStateException("Consulta ja esta cancelada."); }
}
