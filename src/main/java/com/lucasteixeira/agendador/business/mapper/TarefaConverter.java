package com.lucasteixeira.agendador.business.mapper;

import com.lucasteixeira.agendador.business.dto.TarefasDTO;
import com.lucasteixeira.agendador.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") //vai ejetar as dependencias do spring
public interface TarefaConverter {

    TarefasEntity paraTarefasEntity(TarefasDTO dto);

    TarefasDTO paraTarefasDTO(TarefasEntity entity);
}
