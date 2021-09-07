package isi.dan.laboratorios.danmscuentacorriente.exceptions;

import org.springframework.http.HttpStatus;

public class DataNotFoundException extends ApiException {
    public DataNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
