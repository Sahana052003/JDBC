package com.xworkz.passworddata.external;

import com.xworkz.passworddata.internal.PasswordGenerate;

public class Main {
    public static void main(String[] args) {
    String password = "hellowrldd";


    String encryptedPassword = PasswordGenerate.md5Hash(password);

        System.out.println("Encrypted Password: " + encryptedPassword);
}
}