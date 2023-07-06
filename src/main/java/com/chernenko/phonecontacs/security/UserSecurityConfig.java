package com.chernenko.phonecontacs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails myUser = User.builder().username("myUser").password("{noop}123").roles("USER").build();
        return  new InMemoryUserDetailsManager(myUser);
    }
}
