package me.ger_tret.josephus_simulator.dto;

import java.util.List;

public record SimulationStepDto(
        int step,
        int eliminatedId,
        List<Integer> survivors
) {
}
