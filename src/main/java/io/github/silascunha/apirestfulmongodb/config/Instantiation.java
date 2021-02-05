package io.github.silascunha.apirestfulmongodb.config;

import io.github.silascunha.apirestfulmongodb.domain.User;
import io.github.silascunha.apirestfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository uRepository;

    @Override
    public void run(String... args) throws Exception {
        uRepository.deleteAll();

        User u1 = new User(null, "Silas Cunha", "silas@gmail.com");
        User u2 = new User(null, "Ana Paula", "ana@outlook.com");
        User u3 = new User(null, "Miguel Fernandes", "mainexd@gmail.com");

        uRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
