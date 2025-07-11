package com.cursoalura.challengeconversordemonedas.modelos;

public record MonedaApi(String base_code, String target_code, double conversion_rate, double conversion_result) {
}
