package br.edu.clinica.model;

public class EmAtendimento implements EstadoConsulta {
    public String getNome(){ return "EM_ATENDIMENTO"; }
    public EstadoConsulta avancar(){ return new Concluida(); }
    public EstadoConsulta cancelar(){ return new Cancelada(); }
}
