package com.email.Email_writer.Controller;

import lombok.Data;

@Data
public class EmailRequest {
        private String emailContent;
        private String tone;
}