package com.example.northsteel.exception;

public class CharacterEntityNotFoundException extends RuntimeException{
    public CharacterEntityNotFoundException() {
        super("Character not found");
    }
}
