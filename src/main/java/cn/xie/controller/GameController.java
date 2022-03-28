package cn.xie.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xie.entity.Game;
import cn.xie.mapper.GameMapper;

@RestController
public class GameController {

    @Resource
    private GameMapper gameMapper;

    @GetMapping("/game")
    private Game getGameById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return gameMapper.selectById(id);
    }

    @PostMapping("/game")
    private void insertStep(int step, int tileRow, int tileColumn, int tileValue, int nextMove) {
        gameMapper.insert(new Game(step, tileRow, tileColumn, tileValue, nextMove));
    }

}
