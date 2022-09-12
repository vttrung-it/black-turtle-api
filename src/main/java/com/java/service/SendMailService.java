package com.java.service;

import com.java.domain.DTO.EmailDTO;

public interface SendMailService {
    String sendSimpleMail(EmailDTO emailDTO);

    String sendMailWithAttachment(EmailDTO emailDTO);
}
