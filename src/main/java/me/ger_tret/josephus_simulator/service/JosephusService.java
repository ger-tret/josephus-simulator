package me.ger_tret.josephus_simulator.service;

import me.ger_tret.josephus_simulator.dto.SimulationResultDto;

public interface JosephusService {
    SimulationResultDto simulate(int n, int k);
}
