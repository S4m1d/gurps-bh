package ru.s4m1d.db.services;

import ru.s4m1d.db.datamodel.entities.User;

import java.util.List;

public interface UserService {
    public User create(User user);
    public void delete(Long id);
    public User find(Long id);
    public List<User> getAllAsList();
    public Long size();
}
