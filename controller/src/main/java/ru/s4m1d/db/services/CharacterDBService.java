package ru.s4m1d.db.services;

import ru.s4m1d.db.datamodel.entities.Character;

import java.util.List;

public interface CharacterDBService {
    public Character create(Character character);
    public void delete(Long id);
    public Character find(Long id);
    public List<Character> getAllAsList();
    public Long size();
}
