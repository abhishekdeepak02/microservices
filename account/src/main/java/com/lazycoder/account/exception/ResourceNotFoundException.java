package com.lazycoder.account.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message1, String message2, String message3) {

        //String message = String.format("%s not found with %s: %s", message1, message2, message3);
        super(String.format("%s not found with %s: %s", message1, message2, message3));
    }
}
