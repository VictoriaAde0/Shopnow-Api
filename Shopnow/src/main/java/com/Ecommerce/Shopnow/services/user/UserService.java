package com.Ecommerce.Shopnow.services.user;
import com.Ecommerce.Shopnow.dto.UserDto;
import com.Ecommerce.Shopnow.entities.User;

import org.springframework.stereotype.Service;
@Service
public interface UserService {
    User createUser(UserDto userDto);
}
