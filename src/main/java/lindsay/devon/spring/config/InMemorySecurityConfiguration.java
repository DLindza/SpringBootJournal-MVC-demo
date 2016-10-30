package lindsay.devon.spring.config;

/**
 * Created by devon on 10/30/16.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@Configuration
@EnableGlobalAuthentication
public class InMemorySecurityConfiguration {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and().withUser("admin").password("password").roles("USER", "ADMIN");
    }


}
