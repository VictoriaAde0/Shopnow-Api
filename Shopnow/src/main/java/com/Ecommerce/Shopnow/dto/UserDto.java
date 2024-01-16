package com.Ecommerce.Shopnow.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank(message = "lastName cannot be blank")
    private String lastName;
    @NotBlank(message = "firstName cannot be blank")
    private String firstName;

    @NotBlank(message = "email cannot be blank")
    private String email;

    private String password;

    @NotBlank(message = "phoneNumber cannot be blank")
    private String phoneNumber;
}

