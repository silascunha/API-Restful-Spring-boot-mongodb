package io.github.silascunha.apirestfulmongodb.resources;

import io.github.silascunha.apirestfulmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> users = new ArrayList<>();
        User user = new User("1", "Silas", "silascunha@gmail.com");
        users.add(user);
        user = new User("2", "Ana", "ana@gmail.com");
        users.add(user);

        return ResponseEntity.ok().body(users);
    }
}
