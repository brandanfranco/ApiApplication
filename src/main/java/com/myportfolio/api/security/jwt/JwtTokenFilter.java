/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.api.security.jwt;

import com.myportfolio.api.security.service.UserDetailsServiceImpl;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 *
 * @author brand
 */
public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    JwtProvider jwtProvider;
    
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    
    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain) throws ServletException, IOException {
        try{
            String token =getToken(req);
            if(token!=null && jwtProvider.validateToken(token)){
            String nombreUsuario=jwtProvider.getNombreUsuarioFromToken(token);
            
            UserDetails userDetails=  userDetailsService.loadUserByUsername(nombreUsuario);
            UsernamePasswordAuthenticationToken auth=
            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(auth);
            }
            
        }catch(Exception e){
        logger.error("fail en el metodo doFilter");
        }  
        filterChain.doFilter(req, res);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private String getToken(HttpServletRequest request ){
        String header = request.getHeader("Authorization");
        if(header!=null && header.startsWith("Bearer")){
      return header.replace("Bearer", "");  
        }
        
        return null;
            
    }
    
}
