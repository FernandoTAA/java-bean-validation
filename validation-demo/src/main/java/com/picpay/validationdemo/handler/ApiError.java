package com.picpay.validationdemo.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * API Error representation.
 */
@Getter
@AllArgsConstructor
public class ApiError {
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Error> errors;
}