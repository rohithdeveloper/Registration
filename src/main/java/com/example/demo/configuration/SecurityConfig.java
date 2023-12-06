//package com.example.demo.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//public class SecurityConfig {
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Bean
//	public static PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@SuppressWarnings("removal")
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//		http.csrf().disable().authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated())
//				.httpBasic(Customizer.withDefaults());
//		return http.build();
//
//	}
//
//	@Bean
//	public UserDetailsService users() {
//		UserBuilder users = User.builder();
//		//UserDetails user = users.username("user").password(passwordEncoder.encode("password")).roles("USER").build();
//		//UserDetails admin = users.username("admin").password(passwordEncoder.encode("admin")).roles("ADMIN").build();
//		UserDetails user=users.username("user").password(passwordEncoder.encode("password")).build();
//		//return new InMemoryUserDetailsManager(user, admin);
//		return new InMemoryUserDetailsManager(user);
//	}
//}
