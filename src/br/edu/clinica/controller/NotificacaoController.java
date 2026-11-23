package br.edu.clinica.controller;

import java.time.LocalDateTime;

import br.edu.clinica.model.Consulta;
import br.edu.clinica.model.Medico;
import br.edu.clinica.model.Paciente;
import br.edu.clinica.observer.AuditoriaObservador;
import br.edu.clinica.observer.EnfermagemObservador;
import br.edu.clinica.observer.FarmaciaObservador;
import br.edu.clinica.service.ComunicacaoService;
import br.edu.clinica.service.NotificacaoService;
import br.edu.clinica.view.ConsoleView;

public class NotificacaoController {
    private final ConsoleView view = new ConsoleView();
    private final ComunicacaoService comunicacaoService = new ComunicacaoService();
    private final NotificacaoService notificacaoService = new NotificacaoService();

    public void comunicarEntreSetores(){
        view.titulo("Mediator — Comunicação entre setores");
        comunicacaoService.enviar("Recepcao", "Laboratorio", "Paciente aguardando coleta.");
        comunicacaoService.enviar("Laboratorio", "Farmacia", "Exame liberado; preparar medicação.");
        view.linha();
    }

    public void dispararNotificacoes(){
        view.titulo("Observer — Eventos e Assinantes");

        var paciente = new Paciente("Ana", "000.111.222-33");
        var medico   = new Medico("Carlos", "CRM-1234", "Clínico");
        var consulta = new Consulta(paciente, medico, LocalDateTime.now().plusDays(1));
        
        var enfermagem = new EnfermagemObservador();
        var farmacia   = new FarmaciaObservador();
        var auditoria  = new AuditoriaObservador();

        notificacaoService.adicionarObservador(enfermagem);
        notificacaoService.adicionarObservador(farmacia);
        notificacaoService.adicionarObservador(auditoria);

        var anterior = consulta.getEstado();                // AGENDADA
        consulta.setEstado("EM_ATENDIMENTO");
        notificacaoService.notificarMudanca(consulta, anterior);

        notificacaoService.removerObservador(auditoria);

        anterior = consulta.getEstado();                    // EM_ATENDIMENTO
        consulta.setEstado("CONCLUIDA");
        notificacaoService.notificarMudanca(consulta, anterior);

        view.linha();
    }
}
