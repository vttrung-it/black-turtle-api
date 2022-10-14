package com.java.controller;

import com.java.domain.DTO.EmailDTO;
import com.java.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail/")
public class SendMailController {
    @Autowired
    private SendMailService sendMailService;

    @PostMapping("/send-mail")
    public String sendMail(@RequestBody EmailDTO emailDTO) {
        return sendMailService.sendSimpleMail(emailDTO);
    }

    @PostMapping("/send-mail-with-attachment")
    public String sendMailWithAttachment(@RequestBody EmailDTO emailDTO) {
        return sendMailService.sendMailWithAttachment(emailDTO);
    }
}
