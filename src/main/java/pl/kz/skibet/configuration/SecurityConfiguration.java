package pl.kz.skibet.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("kacper").password("{bcrypt}$2y$12$u77yKaRjTF2EhBhFHN3t7O91d8gVS58m/1jtfJ..QQT355MJJV/LW").roles("USER");
    }
}