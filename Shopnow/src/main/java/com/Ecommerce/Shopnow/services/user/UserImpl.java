package com.Ecommerce.Shopnow.services.user;
import com.Ecommerce.Shopnow.dto.UserDto;
import com.Ecommerce.Shopnow.entities.User;
import com.Ecommerce.Shopnow.exceptions.UserAlreadyExistException;
import com.Ecommerce.Shopnow.repositories.UserRepository;
import com.Ecommerce.Shopnow.utilities.PasswordUtility;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserImpl implements UserService {
    private final UserRepository userRepository;
    public UserImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(UserDto userDto) {
    Optional<User> user = userRepository.findByEmail(userDto.getEmail());
        if (user.isPresent()) {
        throw new UserAlreadyExistException("User already exists");
    }

    User userInfo = User.builder()
            .lastName(userDto.getLastName())
            .phoneNumber(userDto.getPhoneNumber())
            .firstName(userDto.getFirstName())
            .email(userDto.getEmail())
            .password(PasswordUtility.hashPassword(userDto.getPassword()))
            .build();

        return userRepository.save(userInfo);
}

}
