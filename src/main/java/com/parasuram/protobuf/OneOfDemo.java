package com.parasuram.protobuf;

import com.parasuram.models.Creds;
import com.parasuram.models.EmailCreds;
import com.parasuram.models.PhoneCreds;

public class OneOfDemo {
    public static void main(String[] args) {
        EmailCreds emailCreds=EmailCreds.newBuilder()
        .setEmail("abc@mail.com")
        .setPwd("admin123")
        .build();

        PhoneCreds phoneCreds=PhoneCreds.newBuilder()
        .setNumber(123456789)
        .setOtp(123)
        .build();

        Creds creds=Creds.newBuilder()
        .setEmailMode(emailCreds)
       // .setPhoneMode(phoneCreds)
        .build();

        login(creds);
        
    }

    private static void login(Creds creds) {
        switch (creds.getModeCase()){
            case EMAILMODE:
                    System.out.println(creds.getEmailMode());
                    break;
            case PHONEMODE:
                System.out.println(creds.getPhoneMode());
                break;

        }
        System.out.println(creds);
    }
}
