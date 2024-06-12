package com.programmeralok.springsecuritydemo.services;

import com.programmeralok.springsecuritydemo.dao.UserRepo;
import com.programmeralok.springsecuritydemo.models.User;
import com.programmeralok.springsecuritydemo.models.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if(user == null) {
            System.out.println(username + " not found");
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user);
    }
}
