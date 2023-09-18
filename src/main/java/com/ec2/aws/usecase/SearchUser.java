package com.ec2.aws.usecase;

import com.ec2.aws.domain.User;
import com.ec2.aws.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchUser {

    private final UserRepository userRepository;

    public SearchUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> execute() {
        return userRepository.findAll();
    }
}
