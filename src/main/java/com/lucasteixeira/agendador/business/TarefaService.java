package com.lucasteixeira.agendador.business;

import com.lucasteixeira.agendador.business.dto.TarefasDTO;
import com.lucasteixeira.agendador.business.mapper.TarefaConverter;
import com.lucasteixeira.agendador.infrastructure.entity.TarefasEntity;
import com.lucasteixeira.agendador.infrastructure.enums.StatusNotificacaoEnum;
import com.lucasteixeira.agendador.infrastructure.repository.TarefasRepository;
import com.lucasteixeira.agendador.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefasRepository tarefaRepository;
    private final TarefaConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa( TarefasDTO tarefasDTO, String token){

        String email = jwtUtil.extractEmailToken(token.substring(7));
        tarefasDTO.setDataCriacao(LocalDateTime.now()); //pega a hora atual
        tarefasDTO.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        tarefasDTO.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefasEntity(tarefasDTO);


        return tarefaConverter.paraTarefasDTO(tarefaRepository.save(entity));
    }

    public List<TarefasDTO> buscaTarefasAgendadasPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal){
        return tarefaConverter.paraListaTarefasDTO(tarefaRepository.findByDataEventoBetween(dataInicial, dataFinal));
    }

    public List<TarefasDTO> buscaTarefasPorEmail(String token){
        String email = jwtUtil.extractEmailToken(token.substring(7));
        List<TarefasEntity> listasTarefas = tarefaRepository.findByEmailUsuario(email);
        return tarefaConverter.paraListaTarefasDTO(listasTarefas);
    }
}
