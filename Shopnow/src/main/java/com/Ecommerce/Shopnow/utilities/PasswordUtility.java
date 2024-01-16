package com.Ecommerce.Shopnow.utilities;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtility {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());}
    public static boolean checkPassword(String candidate, String hashedPassword) {
        return BCrypt.checkpw(candidate, hashedPassword);
    }
}
