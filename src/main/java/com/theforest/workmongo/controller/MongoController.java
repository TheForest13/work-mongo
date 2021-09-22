package com.theforest.workmongo.controller;

import com.theforest.workmongo.entity.Player;
import com.theforest.workmongo.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MongoController {

    private final PlayerRepository playerRepository;

    @PostMapping("/add")
    public String add(@RequestBody Player player) {
        playerRepository.save(player);
        return "add success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        playerRepository.deleteById(id);
        return "delete success";
    }

    @PutMapping("/update")
    public String update(@RequestBody Player player) {
        playerRepository.save(player);
        return "update success";
    }

    @GetMapping("/find")
    public List<Player> find() {
        return playerRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Player> findBy(@PathVariable String id) {
        return playerRepository.findById(id);
    }
}
