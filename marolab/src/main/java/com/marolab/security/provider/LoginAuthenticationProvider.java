package com.marolab.security.provider;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.marolab.security.service.impl.UserLoginService;
import com.marolab.security.vo.User;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
@Component
public class LoginAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private UserLoginService userLoginService;
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        User user;
        Collection<? extends GrantedAuthority> authorities;

        try {
            user = (User) this.userLoginService.loadUserByUsername(username);
            
            // BCryptPasswordEncoder 암호화 인코딩 비
            if (!bcryptPasswordEncoder.matches(password, user.getPassword())) throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");

            authorities = user.getAuthorities();
        } catch(UsernameNotFoundException e) {
            throw new UsernameNotFoundException(e.getMessage());
        } catch(BadCredentialsException e) {
            throw new BadCredentialsException(e.getMessage());
        } catch(Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return new UsernamePasswordAuthenticationToken(user, password, authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
