package me.ger_tret.josephus_simulator.exception;

import java.time.LocalDateTime;
import java.util.Map;

public record ApiError(
        String message,
        int status,
        LocalDateTime time,
        Map<String, String> errors
) {
}
