package com.project.app.DTO;

import lombok.Data;

@Data
public class AuthResponseDTO {
    private String accessToken;
    private String tokenType = "Bearer: ";
    String message;
    Long userID;

    public AuthResponseDTO(String accessToken){
        this.accessToken = accessToken;
    }

}
