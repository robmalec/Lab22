package co.grandcircus.lab22.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.lab22.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
