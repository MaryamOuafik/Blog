package bloggy.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import bloggy.models.User;
import bloggy.repositories.UserRepository;

import java.util.Optional;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userInfo = repository.findByEmail(username);
//		  UserDetails userDetails = userInfo.username(userInfo.getEmail()).password(userInfo.getPassword()).roles(userInfo.getRole()).build();
        return org.springframework.security.core.userdetails.User.builder()
              .username(userInfo.getEmail())
              .password(userInfo.getPassword()) // Ensure that you properly hash the password stored in the database.
              .roles(userInfo.getRole())
              .build();
		  
        
              

    }
}
