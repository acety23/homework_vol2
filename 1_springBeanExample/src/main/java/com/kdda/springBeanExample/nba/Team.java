package com.kdda.springBeanExample.nba;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Team {
    public String name;
    public String city;
    public List<Player> players;

    @Bean("heat")
    public Team GetHeat() {
        return new Team("Heat", "Miami", List.of(Player.builder().name("Dwyane Wade").num("3").build()));
    }
}
