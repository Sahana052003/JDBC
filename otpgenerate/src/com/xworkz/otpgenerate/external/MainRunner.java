package com.xworkz.otpgenerate.external;

import com.xworkz.otpgenerate.internal.OTPGenerator;

//package com.xworkz.otpgenerate.external;
//
//import com.xworkz.otpgenerate.internal.OTPGenerator;
//
//public class MainRunner {
//    public static void main(String[] args) {
//        String otp = OTPGenerator.generateOTP();
//
//        System.out.println("Generated OTP: " + otp);
//    }
//    }
//
//public class MainRunner {
//    public static void main(String[] args) {
//        OTPGenerator otpGenerator = new OTPGenerator();
//        int l = 8;
//        System.out.println(otpGenerator.method(l));
//    }
//}

public class MainRunner {

    public static void main(String[] args) {

        String otp = OTPGenerator.generateOTP();

        System.out.println("Generated OTP: " + otp);
    }
}
