package me.ger_tret.josephus_simulator.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record SimulationStepDto(
        @Schema(example = "1")
        int step,
        @Schema(example = "3")
        int eliminatedId,
        @Schema(example = "[1, 2, 4, 5]")
        List<Integer> survivors
) {
}
