package com.brindabhattarai.Shopping;

//import com.brindabhattarai.Shopping.email.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingApp {

    @Autowired
//    private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(ShoppingApp.class, args);
    }
//    @EventListener(ApplicationReadyEvent.class)
//    public void sendEmail(){
//        senderService.sendSimpleEmail("aryalaashutosh@gmail.com",
//                "this is Subject",
//                "this is body part");
//
//    }

}
