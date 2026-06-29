package me.ger_tret.josephus_simulator.service;

import me.ger_tret.josephus_simulator.dto.SimulationResultDto;
import me.ger_tret.josephus_simulator.dto.SimulationStepDto;

import java.util.ArrayList;
import java.util.List;

public class JosephusServiceImpl implements JosephusService{

    @Override
    public SimulationResultDto simulate(int n, int k){
        List<Integer> participants = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            participants.add(i);
        }

        List<SimulationStepDto> steps = new ArrayList<>();
        int currentIndex = 0;

        while(participants.size() > 1){
            currentIndex = (currentIndex + k - 1) % participants.size();

            int eliminatedId = participants.remove(currentIndex);

            steps.add(new SimulationStepDto(
                    (steps.size() + 1),
                    eliminatedId,
                    new ArrayList<>(participants)
            ));

        }
        return new SimulationResultDto(n, k, participants.getFirst(), steps);
    }
}
