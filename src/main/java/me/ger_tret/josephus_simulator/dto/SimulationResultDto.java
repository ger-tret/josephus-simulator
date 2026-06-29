package me.ger_tret.josephus_simulator.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record SimulationResultDto(
        @Schema(example = "10")
        int totalParticipants,
        @Schema(example = "3")
        int stepSize,
        @Schema(example = "4")
        int survivorId,
        List<SimulationStepDto> steps
) {
}
