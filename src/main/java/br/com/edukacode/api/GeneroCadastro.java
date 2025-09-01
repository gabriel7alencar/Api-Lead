package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record GeneroCadastro(
        @NotBlank
        String nome
) {
}
