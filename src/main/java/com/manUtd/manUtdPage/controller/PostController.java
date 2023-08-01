package com.manUtd.manUtdPage.controller;

import com.manUtd.manUtdPage.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @GetMapping("/posts")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("Not implemneted");
    }

    @GetMapping("/posts")
    public Post getSinglePost(){
        throw new IllegalArgumentException("Not implemneted");
    }

}
