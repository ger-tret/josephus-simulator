package me.ger_tret.josephus_simulator;

import me.ger_tret.josephus_simulator.dto.SimulationResultDto;
import me.ger_tret.josephus_simulator.service.JosephusService;
import me.ger_tret.josephus_simulator.service.JosephusServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class JosephusServiceTest {

    private final JosephusService josephusService = new JosephusServiceImpl();

    @Test
    @DisplayName("Should return survivor when n = 5 and k = 3")
    void shouldReturnCorrectSurvivorForStandardInput(){

        int n = 5;
        int k = 3;

        SimulationResultDto simulationResultDto = josephusService.simulate(n, k);

        assertThat(simulationResultDto.survivorId()).isEqualTo(4);

    }

    @Test
    @DisplayName("Should remove participants in order when k = 1")
    void shouldRemoveInOrderWhenStepIsOne(){
        SimulationResultDto resultDto = josephusService.simulate(3, 1);

        assertThat(resultDto.survivorId()).isEqualTo(3);
        assertThat(resultDto.steps().get(0).eliminatedId()).isEqualTo(1);
        assertThat(resultDto.steps().get(1).eliminatedId()).isEqualTo(2);
    }
}
