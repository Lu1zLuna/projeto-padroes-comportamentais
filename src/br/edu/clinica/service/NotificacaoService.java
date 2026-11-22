package br.edu.clinica.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.clinica.model.Consulta;
import br.edu.clinica.observer.*;

public class NotificacaoService {
    private final List<ObservadorConsulta> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorConsulta obs){
        if (!observadores.contains(obs)) observadores.add(obs);
        // PADRÃO SUGERIDO: OBSERVER
        // Ideia: trocar Runnable por interface Observer {update(evento)}
        // e notificar todos quando um evento ocorrer (estado da consulta mudou etc.).
        // TODO alunos: criar Subject/Observer específicos.
    }

    public void notificarMudanca(String evento){
        System.out.println("[Service] Notificando: " + evento);
        observadores.forEach(Runnable::run); // placeholder simplificado
    }
}
