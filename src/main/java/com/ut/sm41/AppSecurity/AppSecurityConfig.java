package com.ut.sm41.AppSecurity;

import com.ut.sm41.service.UserAuthService;
import com.ut.sm41.service.impl.CustomAuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.http.UserDetailsServiceFactoryBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.security.interfaces.RSAPublicKey;

import static com.ut.sm41.service.impl.AuthenticationConstants.URL_CONFIG_PRIVATE_AUTHETICATION;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

   @Value("${spring.security.oauth2.resourceserver.jwt.key-value}")
    RSAPublicKey publicKey;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable().formLogin(AbstractHttpConfigurer::disable).csrf(AbstractHttpConfigurer::disable)
                .cors().and()
                .authorizeRequests(authorize -> authorize.antMatchers(URL_CONFIG_PRIVATE_AUTHETICATION).authenticated()
                        .antMatchers("/voltux/login*").permitAll())
                .sessionManagement(
                        sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer().jwt().authenticationManager(customAuthenticationManager());
    }

    @Bean
    public CustomAuthenticationManager customAuthenticationManager() {
        return new CustomAuthenticationManager();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }



    @Autowired
    private UserAuthService userAuthService;



	@Autowired
	public void registerGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// Ideally database authentication is required
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("user")
				.password("$2a$10$ZmXpFUTVZPfxT8bbkUJzrO7Lln16m5CdedxbdVt1O5sPbQBfqQVaS").roles("USER").and()
				.passwordEncoder(passwordEncoder()).withUser("admin")
				.password("$2a$10$ZmXpFUTVZPfxT8bbkUJzrO7Lln16m5CdedxbdVt1O5sPbQBfqQVaS").roles("USER", "ADMIN");
	}



    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}