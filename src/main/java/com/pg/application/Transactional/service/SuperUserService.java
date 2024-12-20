package com.pg.application.Transactional.service;

import java.security.SecureRandom;
public class SuperUserService {


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
