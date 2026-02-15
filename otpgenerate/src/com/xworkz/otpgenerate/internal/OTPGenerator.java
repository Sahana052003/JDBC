package com.xworkz.otpgenerate.internal;//package com.xworkz.otpgenerate.internal;

import java.security.SecureRandom;

public class OTPGenerator {

    public static String generateOTP() {

        String otp="";
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 8; i++) {
            otp += random.nextInt(10);
        }

        return otp;
    }
}


//import java.util.Random;
//
//public class OTPGenerator {
//    public char[] method(int l){
//        System.out.println("Generate new OTP");
//        System.out.println("OTP is : ");
//        String s="@#$%&1234567890";
//        Random r=new Random();
//        char a[]=new char[l];
//        for(int i=0;i<l;i++){
//            a[i]=s.charAt(r.nextInt(s.length()));
//        }
//        return a;
//    }
//}

//
//import java.security.SecureRandom;
//
//public class OTPGenerator {
//
//    public static String generateOTP() {
//
//        String characters = "0123456789abcdefghijklmnopqrstuvwxyz";
//        SecureRandom random = new SecureRandom();
//
//        StringBuilder otp = new StringBuilder(8);
//
//        for (int i = 0; i < 8; i++) {
//            otp.append(characters.charAt(random.nextInt(characters.length())));
//        }
//
//        return otp.toString(); // returns 8-character random string
//    }
//}



//import java.security.SecureRandom;
//
//public class OTPGenerator {
//
//    public static String generateOTP() {
//        SecureRandom random = new SecureRandom();
//        String digits = "0123456789";
//        String letters = "abcdefghijklmnopqrstuvwxyz";
//
//        StringBuilder otp = new StringBuilder(8);
//
//        // Random position to place a letter
//        int letterPosition = random.nextInt(8);
//
//        for (int i = 0; i < 8; i++) {
//            if (i == letterPosition) {
//                otp.append(letters.charAt(random.nextInt(letters.length())));
//            } else {
//
//                otp.append(digits.charAt(random.nextInt(digits.length())));
//            }
//        }
//
//        return otp.toString();
//    }
//}
