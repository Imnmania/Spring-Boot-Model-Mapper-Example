package me.niloybiswas.modelmapper.service;

import lombok.extern.slf4j.Slf4j;
import me.niloybiswas.modelmapper.dto.UserDTO;
import me.niloybiswas.modelmapper.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private ModelMapper mapper;

    public UserDTO getUser() {
        // mock db call
        User user = new User();
        user.setId("1234");
        user.setEmail("n@b.com");
        user.setFirstName("Niloy");
        user.setLastName("Biswas");
        user.setPassword("password");

        UserDTO userDTO = mapper.map(user, UserDTO.class);
        userDTO.setFullName(user.getFirstName() + " " + user.getLastName());

        return userDTO;
    }

}