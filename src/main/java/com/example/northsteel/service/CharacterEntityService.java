package com.example.northsteel.service;

import com.example.northsteel.dto.CharacterEntityRequest;
import com.example.northsteel.entity.CharacterEntity;
import com.example.northsteel.exception.CharacterEntityNotFoundException;
import com.example.northsteel.repository.CharacterEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterEntityService {
    @Autowired
    private CharacterEntityRepository characterRepository;

    public List<CharacterEntity> findAll(){
        return characterRepository.findAll();
    }

    public CharacterEntity createEntity(CharacterEntityRequest characterRequest){
        CharacterEntity ce = new CharacterEntity();
        ce.setName(characterRequest.getName());
        ce.setColor(characterRequest.getColor());
        ce.setAuthorEmail(characterRequest.getAuthorEmail());
        return characterRepository.save(ce);

    }

    public CharacterEntity findById(Long id){
        Optional<CharacterEntity> optionalCharacter = characterRepository.findById(id);
        if(optionalCharacter.isEmpty()){
            throw new CharacterEntityNotFoundException();
        }
        return optionalCharacter.get();
    }
}
