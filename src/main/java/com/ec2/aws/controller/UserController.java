package com.ec2.aws.controller;

import com.ec2.aws.domain.User;
import com.ec2.aws.usecase.SaveUser;
import com.ec2.aws.usecase.SearchUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final SearchUser searchUser;
    private final SaveUser saveUser;

    public UserController(SearchUser searchUser, SaveUser saveUser) {
        this.searchUser = searchUser;
        this.saveUser = saveUser;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        var users = searchUser.execute();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        user = saveUser.execute(user);
        return ResponseEntity.ok(user);
    }
}
