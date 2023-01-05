package com.ref.management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
//@EnableWebSecurity
public class SecSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
    	UserDetails user1 = User.withUsername("user1")
                .password(passwordEncoder().encode("user1Pass"))
                .roles("USER")
                .build();
            UserDetails user2 = User.withUsername("user2")
                .password(passwordEncoder().encode("user2Pass"))
                .roles("USER")
                .build();
            UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("adminPass"))
                .roles("ADMIN")
                .build();
            return new InMemoryUserDetailsManager(user1, user2, admin);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http.authorizeRequests().anyRequest().authenticated();
//    	http.csrf()
//        .disable()
//        .authorizeRequests()
//        .requestMatchers("/admin/**")
//        .hasRole("ADMIN")
//        .requestMatchers("/anonymous*")
//        .anonymous()
//        .requestMatchers("/login*", "*actuator*","/index.html")
//        .permitAll()
//        .anyRequest()
//        .authenticated()
//        .and().formLogin().successHandler(appAuthenticationSuccessHandler())
//        .loginPage("/login.html")
//        .loginProcessingUrl("/perform_login")
//        .defaultSuccessUrl("/index.html", true)
//        .failureUrl("/login.html?error=true")
//        .failureHandler(null)
//        .and()
//        .logout()
//        .logoutUrl("/perform_logout")
//        .deleteCookies("JSESSIONID");
        return http.build();
    }
	@Bean 
    public PasswordEncoder passwordEncoder() { 
        return new BCryptPasswordEncoder(); 
    }
	@Bean
	public AuthenticationSuccessHandler appAuthenticationSuccessHandler(){
	     return new RefererRedirectionAuthenticationSuccessHandler();
	}
}