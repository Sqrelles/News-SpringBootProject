package io.github.sqrelles.news2.exception;

import lombok.Data;

import java.util.Date;

@Data
public class Error {
    private Integer statusCod;
    private String message;
    private Date timestamp;
}
