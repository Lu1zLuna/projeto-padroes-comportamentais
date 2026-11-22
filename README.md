# MediClinic — Padrões Comportamentais (AV3)

## Como executar
```bash
javac -d out $(find src -name "*.java")
java -cp out br.edu.clinica.main.ClinicaMain
```

## Responsáveis
| Padrão | Responsável |
|---|---|
| Iterator | João Alberto |
| Memento | (a definir) |
| State | (a definir) |
| Strategy | Alan |
| Observer | Luiz Luna |

---

## Iterator — João Alberto
- **Problema:**
- **Arquivos:**
- **Como verificar:**

## Memento — *(responsável a preencher)*
- **Problema:** 
- **Arquivos:** 
- **Como verificar:** 

## State — *(responsável a preencher)*
- **Problema:** 
- **Arquivos:** 
- **Como verificar:** 

## Strategy — Alan
- **Problema:**
- **Arquivos:**
- **Como verificar:**

## Observer — Luiz Luna
- **Problema:** as notificações eram disparadas por `Runnable` anônimo, sem evento e sem saber quem reagia.
- **Arquivos:** 
    - Modificados:
        - `service/NotificacaoService` e `controller/NotificacaoController`
    - Criados:
        - `observer/ObservadorConsulta`, `observer/EventoConsulta`, `observer/EnfermagemObservador`, `observer/FarmaciaObservador`, `observer/AuditoriaObservador`
- **Como verificar:** seção "Observer — Eventos e Assinantes" mostra Enfermagem e Auditoria na 1ª transição (AGENDADA→EM_ATENDIMENTO); apenas Farmácia na 2ª (EM_ATENDIMENTO→CONCLUIDA), pois Auditoria foi desinscrita.