package com.GlobalExceptionHandling.Exception;

import lombok.*;

@Data
@NoArgsConstructor

@Getter
@Setter
public class ApiResponse {

    private String message;

    private boolean success;
    public ApiResponse(String message, boolean success) {
        super();
        this.message = message;
        this.success = success;
    }


}
