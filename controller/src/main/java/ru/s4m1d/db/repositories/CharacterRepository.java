package ru.s4m1d.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.s4m1d.db.datamodel.entities.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
