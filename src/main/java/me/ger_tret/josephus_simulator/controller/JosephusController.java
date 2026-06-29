package me.ger_tret.josephus_simulator.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.ger_tret.josephus_simulator.dto.SimulationRequestDto;
import me.ger_tret.josephus_simulator.dto.SimulationResultDto;
import me.ger_tret.josephus_simulator.service.JosephusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/simulation")
@RequiredArgsConstructor
@Tag(name = "Josephus simulator", description = "API for Josephus Problem visualisation")
public class JosephusController {

    private final JosephusService josephusService;

    @PostMapping
    public ResponseEntity<SimulationResultDto> calculate(@Valid @RequestBody SimulationRequestDto requestDto){
        SimulationResultDto result = josephusService.simulate(requestDto.n(), requestDto.k());
        return ResponseEntity.ok(result);
    }
}
