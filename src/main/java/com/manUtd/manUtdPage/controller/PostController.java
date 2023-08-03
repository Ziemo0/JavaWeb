package com.manUtd.manUtdPage.controller;

import com.manUtd.manUtdPage.model.Player;
import com.manUtd.manUtdPage.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/players")
    public List<Player> getPlayers(){
        return postService.getPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getSinglePost(@PathVariable long id){
        return postService.getSinglePlayer(id);
    }

}
