package com.dbs.firstwebapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringWebSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.requestMatchers("/courses").hasRole("DEVELOPER"))
       .authorizeHttpRequests(auth->auth.requestMatchers("/users").permitAll()).httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails u1 = User.withUsername("james")
                .password("$2a$12$baoqfccNyeRyvX.C5tNv6uEGahGvxpXF.T2M1mjM992KXISwTT6ZK")
                .roles("DEVELOPER")
                .build();
        UserDetails u2 = User.withUsername("john")
                .password("$2a$12$baoqfccNyeRyvX.C5tNv6uEGahGvxpXF.T2M1mjM992KXISwTT6ZK")
                .roles("DEVELOPER")
                .build();

        return new InMemoryUserDetailsManager(u1,u2);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
