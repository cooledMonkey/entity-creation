package com.example.northsteel.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CharacterEntityRequest {
    String color;
    String name;
    String authorEmail;
}
