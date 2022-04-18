package com.cognizant.auditauthorization.config;

import com.cognizant.auditauthorization.model.ProjectManagerDetails;
import com.cognizant.auditauthorization.service.JwtTokenService;
import com.cognizant.auditauthorization.service.ProjectManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {
	//The filter authenticates and generates the token, authorizes the user for every request 

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private ProjectManagerService projectManagerService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authorization = httpServletRequest.getHeader("Authorization");
        String token = null;
        String userName = null;

        if(null != authorization && authorization.startsWith("Bearer ")) {
          public void Nocode(){
            log.info("code is missing !!");
        }
        }

        if(null != userName && SecurityContextHolder.getContext().getAuthentication() == null) {
           public void Nocode(){
            log.info("code is missing !!");
        }

            if(jwtTokenService.validateToken(token,userDetails)) {
                public void Nocode(){
            log.info("code is missing !!");
        }

                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }

        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
