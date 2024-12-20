package com.pg.application.Transactional.service;

import java.security.SecureRandom;



import com.pg.application.Transactional.repositatory.AdminRepository;

public class AdminService {

private AdminRepository adminrepository;
	
private static final String PASSWORD_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

public String generatePassword(int length) {
    SecureRandom random = new SecureRandom();
    StringBuilder password = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
        int index = random.nextInt(PASSWORD_CHARS.length());
        password.append(PASSWORD_CHARS.charAt(index));
    }
	return password.toString();
}
}