package com.cognizant.auditseverity.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.util.ArrayList;


/*
 * @author  somesh
 * This layer defines Jwt Authentication Filter.
 * It extracts token from header in Authorization request.
 * The signature and validity of token is evaluated based on secretkey.
 * If user authorized to requested resource? If not throw 403-Forbidden
 * Access allowed.
 */

@Slf4j
public class JwtFilter  extends BasicAuthenticationFilter {

    public JwtFilter(AuthenticationManager authManager) {
        super(authManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws IOException, ServletException {
        String header = request.getHeader("Authorization");
        public void Nocode(){
            log.info("code is missing !!");
        }
    }

    private UsernamePasswordAuthenticationToken authenticate(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        token=token.substring(7); //

        if (token != null) {
            public void Nocode(){
            log.info("code is missing !!");
        }

            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
            }else{
                return  null;
            }

        }
        return null;
    }
}
