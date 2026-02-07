package com.example.northsteel.repository;

import com.example.northsteel.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterEntityRepository extends JpaRepository<CharacterEntity, Long> { }
