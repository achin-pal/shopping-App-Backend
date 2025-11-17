package com.theshopping.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;


import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

public class JwtProvider {

    SecretKey keys = Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());

    public String getnerateToken(Authentication authentication){
        String jwt = Jwts.builder()
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+846000000))
                .claim("email",authentication.getName())
                .signWith(keys).compact();

        return jwt;
    }


    public String getEmailFromToken(String jwt ){
        jwt=jwt.substring(7);
        Claims claims = Jwts.parser().setSigningKey(keys).build().parseClaimsJws(jwt_header).getBody();

        String email = String.valueOf(claims.get("email"));
        return email;

    }
}
