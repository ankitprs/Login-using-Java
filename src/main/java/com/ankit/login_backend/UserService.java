package com.ankit.login_backend;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final String salt = "my_salt";
    private String encryptPassword(String password){
        String hash = BCrypt.hashpw(password, salt);
        return hash;
    }

    @Autowired
    private UserRepository userRepository;

    public boolean existsByUsername(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public User signup(User user) {
        // Perform any additional processing, such as password hashing, before saving to the database
        return userRepository.save(user);
    }

}
