package br.edu.clinica.model;

public class Agendada implements EstadoConsulta {
    public String getNome(){ return "AGENDADA"; }
    public EstadoConsulta avancar(){ return new EmAtendimento(); }
    public EstadoConsulta cancelar(){ return new Cancelada(); }
}
