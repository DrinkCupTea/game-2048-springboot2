package cn.xie.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xie.entity.Game;
import cn.xie.mapper.GameMapper;

@CrossOrigin
@RestController
public class GameController {

    @Resource
    private GameMapper gameMapper;

    @GetMapping("/game")
    private Game getGameById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return gameMapper.selectById(id);
    }

    @DeleteMapping("/game")
    private void clearGames() {
        gameMapper.delete(null);
    }

    @PostMapping("/game")
    private void insertStep(int id, int tileRow, int tileColumn, int tileValue, String nextMove) {
        gameMapper.insert(new Game(id, tileRow, tileColumn, tileValue, nextMove));
    }

}
