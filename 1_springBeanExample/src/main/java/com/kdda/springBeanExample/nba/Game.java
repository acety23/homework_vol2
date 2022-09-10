package com.kdda.springBeanExample.nba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class Game {

    //Java显示配置装配的Bean
    @Autowired
    @Qualifier("heat")
    private Team heat;

    //XML显示配置装配的Bean
    @Resource
    private Team bulls;

    public void play() {
        log.info("{} VS. {}", bulls.getName(), heat.getName());
        log.info("{} has {}, {} has {}", bulls.getName(), bulls.getPlayers(), heat.getName(), heat.getPlayers());
    }
}
