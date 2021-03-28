package ru.s4m1d.db.datamodel.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "service_user")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    public User(Long id, String nickname){
        this.id = id;
        this.nickname = nickname;
    }

    public User(String nickname) {
        this.nickname = nickname;
    }

    public User() {

    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nickname);
    }

    @Override
    public boolean equals(Object obj) {
        return nickname.equals(obj);
    }
}
