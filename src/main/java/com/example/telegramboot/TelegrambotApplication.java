package com.example.telegramboot;

import com.example.telegramboot.profile.DefaultProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

//@DefaultProfile
@SpringBootApplication
public class TelegrambotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(TelegrambotApplication.class, args);
    }

}
