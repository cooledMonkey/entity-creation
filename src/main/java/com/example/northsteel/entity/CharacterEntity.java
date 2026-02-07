package com.example.northsteel.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Pattern(regexp = "^#[A-Fa-f0-9]{6}$", message = "Должно соответствовать виду #FFFFFF")
    @Schema(example = "#FF69B4")
    String color;
    @NotBlank(message = "Имя не должно быть пустым")
    @Schema(example = "Kirbi")
    String name;
    @Email(message = "Email некорректный")
    @Schema(example = "masahiro@gmail.com")
    String authorEmail;

    public CharacterEntity() {}
}
