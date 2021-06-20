package br.edu.infnet.consumirapi.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.infnet.consumirapi.model.User;
import br.edu.infnet.consumirapi.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
