package ru.s4m1d.db.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.s4m1d.db.datamodel.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
