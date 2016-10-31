package lindsay.devon.spring.config;

/**
 * Created by devon on 10/30/16.
 */

//THIS PROVIDES SECURITY FOR YOUR RESOURCES / DATABASE QUEIRIES / HELPS PREVENT RANDOM PEOPLE
    //ACCESSING THE POST , PUT AND DELETE FUNCTIONALITY

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalAuthentication
public class ResourceSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/api/**").authenticated()
                .and()
                // - default browswer login   .httpBasic();
                // - default login page .formLogin();
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout().permitAll();
    }
}
