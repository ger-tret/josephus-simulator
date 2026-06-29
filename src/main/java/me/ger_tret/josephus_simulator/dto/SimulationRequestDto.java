package me.ger_tret.josephus_simulator.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record SimulationRequestDto(
        @Schema(example = "10", description = "Total number of participants")
        @Min(value = 1, message = "Participants count must be at least 1")
        @Max(value = 50, message = "For visualisation purposes, max participants count is 50")
        int n,

        @Schema(example = "3", description = "Elimination step")
        @Min(value = 1, message = "Step size must be at least 1")
        int k
) {
}
