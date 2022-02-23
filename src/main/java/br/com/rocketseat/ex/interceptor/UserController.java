package br.com.rocketseat.ex.interceptor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setEmail("teste@rocket.com");
        user.setName("Rocket Seat");
        return ResponseEntity.ok(user);
    }

}
