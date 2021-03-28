package ru.s4m1d.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.s4m1d.db.datamodel.entities.User;
import ru.s4m1d.db.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User find(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getAllAsList() {
        return userRepository.findAll();
    }

    @Override
    public Long size(){
        return getAllAsList().stream().count();
    }
}
