package com.example.northsteel.controller;

import com.example.northsteel.dto.CharacterEntityRequest;
import com.example.northsteel.entity.CharacterEntity;
import com.example.northsteel.service.CharacterEntityService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterEntityController {
    @Autowired
    private CharacterEntityService characterEntityService;

    @GetMapping("/")
    public List<CharacterEntity> getAllCharacters(){
        return characterEntityService.findAll();
    }

    @GetMapping("/{id}")
    public CharacterEntity getCharacterById(@PathVariable Long id){
        return characterEntityService.findById(id);
    }

    @PostMapping("/")
    public CharacterEntity createCharacter(@RequestBody CharacterEntityRequest characterEntityRequest){
        return characterEntityService.createEntity(characterEntityRequest);
    }
}
