package sn.ucad.master.assurance.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN","USER");
		auth.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		
	    http.formLogin().loginPage("/login");
		//http.formLogin();
		http.authorizeRequests().antMatchers("/lists","/form").hasRole("USER");
		http.authorizeRequests().antMatchers("/index2").hasRole("ADMIN");
	}

}
