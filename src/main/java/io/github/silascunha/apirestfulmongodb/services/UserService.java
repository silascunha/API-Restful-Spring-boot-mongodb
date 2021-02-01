package io.github.silascunha.apirestfulmongodb.services;

import io.github.silascunha.apirestfulmongodb.domain.User;
import io.github.silascunha.apirestfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
