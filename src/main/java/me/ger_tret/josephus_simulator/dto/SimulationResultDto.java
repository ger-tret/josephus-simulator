package me.ger_tret.josephus_simulator.dto;

import java.util.List;

public record SimulationResultDto(
        int totalParticipants,
        int stepSize,
        int survivorId,
        List<SimulationStepDto> steps
) {
}
