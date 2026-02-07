package com.example.northsteel.exception;

public class CharacterEntityNotFoundException extends RuntimeException{
    public CharacterEntityNotFoundException() {
        super("Персонаж не найден");
    }
}
