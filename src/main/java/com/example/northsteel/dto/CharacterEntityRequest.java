package com.example.northsteel.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CharacterEntityRequest {
    @Pattern(regexp = "^#[A-Fa-f0-9]{6}$", message = "Должно соответствовать виду #FFFFFF")
    @Schema(example = "#FF69B4")
    String color;
    @NotBlank(message = "Имя не должно быть пустым")
    @Schema(example = "Kirbi")
    String name;
    @Email(message = "Email некорректный")
    @Schema(example = "masahiro@gmail.com")
    String authorEmail;
}
