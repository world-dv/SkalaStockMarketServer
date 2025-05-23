package com.example.demo.dto.player.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateConfirmationRequest {
    private String playerPassword;
    private String newConfirmation;
}
