package com.manUtd.manUtdPage.controller;

import com.manUtd.manUtdPage.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @GetMapping("/players")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("Not implemneted");
    }

    @GetMapping("/players/{id}")
    public Post getSinglePost(@PathVariable long id){
        throw new IllegalArgumentException("Not implemneted");
    }

}
