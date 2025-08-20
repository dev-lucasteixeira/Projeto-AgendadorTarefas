package com.lucasteixeira.agendador.controller;

import com.lucasteixeira.agendador.business.TarefaService;
import com.lucasteixeira.agendador.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {

    private final TarefaService tarefaService;

    @PostMapping
    public ResponseEntity <TarefasDTO> gravarTarefa(@RequestBody TarefasDTO tarefasDTO,
                                                    @RequestHeader("Authorization") String token){
        return ResponseEntity.ok(tarefaService.gravarTarefa(tarefasDTO, token));
    }
}
