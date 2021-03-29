package ru.s4m1d.db.datamodel.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.s4m1d.gurps.datamodel.CharacterDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gurps_character")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Character {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "characterName")
    private String characterName;

    @Column(name = "imageName")
    private String imageName;

    @Column(name = "iconName")
    private String iconName;

    @Column(name = "strength")
    private int strength;

    @Column(name = "dexterity")
    private int dexterity;

    @Column(name = "iq")
    private int iq;

    @Column(name = "health")
    private int health;

    @Override
    public int hashCode(){
        return Objects.hash(characterName);
    }

    @Override
    public boolean equals(Object obj) {
        return characterName.equals(obj);
    }

}
