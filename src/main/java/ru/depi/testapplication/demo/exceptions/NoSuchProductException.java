package ru.depi.testapplication.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author DePi
 **/
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Product not found")
public class NoSuchProductException extends RuntimeException {
}
