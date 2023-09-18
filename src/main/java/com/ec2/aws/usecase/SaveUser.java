package com.ec2.aws.usecase;

import com.ec2.aws.domain.User;
import com.ec2.aws.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveUser {

    private final UserRepository userRepository;

    public SaveUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        return userRepository.save(user);
    }
}
