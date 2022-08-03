package com.hossein.uniManS.controllers.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.uniManS.dto.login.AuthReq;
import com.hossein.uniManS.dto.login.AuthRes;
import com.hossein.uniManS.security.jwt.JwtTokenUtil;
import com.hossein.uniManS.services.impl.UniManSUserDetailsService;

@RestController
@RequestMapping("/UniManS")
public class LoginController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UniManSUserDetailsService uniManSUserDetailsService;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@PostMapping("/login")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthReq authReq) throws Exception {
		this.authenticate(authReq.getUsername(), authReq.getPassword());
		final UserDetails userDetails = this.uniManSUserDetailsService.loadUserByUsername(authReq.getUsername());
		final String token = this.jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthRes(token));
	}
	
	public void authenticate(String username, String password) throws Exception {
		
		try {
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_EXCEPTION", e);
		}
		
	}
	
	
}
