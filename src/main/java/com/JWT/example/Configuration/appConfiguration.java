package com.JWT.example.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class appConfiguration {

    @Bean
    public UserDetailsService userDetailsService(){

       UserDetails user =  User.builder().username("Harshit").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
       UserDetails user2 =  User.builder().username("Harshit1").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
       return new InMemoryUserDetailsManager(user , user2);
    }

    //pasword encoder
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
