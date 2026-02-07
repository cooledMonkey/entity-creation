package com.example.northsteel.controller;

import com.example.northsteel.dto.CharacterEntityRequest;
import com.example.northsteel.entity.CharacterEntity;
import com.example.northsteel.service.CharacterEntityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterEntityController {
    @Autowired
    private CharacterEntityService characterEntityService;

    @Operation(summary = "Получить все")
    @GetMapping("/")
    public List<CharacterEntity> getAllCharacters(){
        return characterEntityService.findAll();
    }

    @Operation(summary = "Получить по id")
    @GetMapping("/{id}")
    public CharacterEntity getCharacterById(@PathVariable Long id){
        return characterEntityService.findById(id);
    }

    @Operation(summary = "Создать сущность")
    @PostMapping("/")
    public CharacterEntity createCharacter(@Valid  @RequestBody CharacterEntityRequest characterEntityRequest){
        return characterEntityService.createEntity(characterEntityRequest);
    }

    @Operation(summary = "Изменить сущность")
    @PutMapping("/{id}")
    public CharacterEntity updateCharacter(@PathVariable Long id,
                                           @Valid @RequestBody CharacterEntityRequest characterEntityRequest){
        return characterEntityService.update(id, characterEntityRequest);
    }
}
