package com.mytrip.mobile.gateway.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MobileSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
  
        auth.inMemoryAuthentication()
          .withUser("temporary").password("temporary").roles("ADMIN")
          .and()
          .withUser("user").password("userPass").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()
        .authorizeRequests()
        .and()
        .exceptionHandling()
        .authenticationEntryPoint(restAuthenticationEntryPoint)
        .and()
        .authorizeRequests()
        .antMatchers("/city/capital").authenticated()
//        .antMatchers("/flight-fare-service/**").authenticated()
        .and()
        .httpBasic()
//        .and()
//        .successHandler(authenticationSuccessHandler)
//        .failureHandler(new SimpleUrlAuthenticationFailureHandler())
        .and()
        .logout();
    }

}
