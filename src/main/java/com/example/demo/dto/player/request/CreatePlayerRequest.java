package com.example.demo.dto.player.request;

import com.example.demo.domain.player.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreatePlayerRequest {

    private String playerId;
    private String playerPw;
    private Long playerMoney;
    private String confirmation;

    public Player toEntity() {
        return Player.builder()
                .playerId(playerId)
                .playerPw(playerPw)
                .playerMoney(playerMoney)
                .confirmation(confirmation)
                .build();
    }
}
