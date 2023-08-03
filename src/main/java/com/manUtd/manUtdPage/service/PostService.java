package com.manUtd.manUtdPage.service;

import com.manUtd.manUtdPage.model.Player;
import com.manUtd.manUtdPage.repository.PostInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostInterface postInterface;
    public List<Player> getPlayers(){
        return postInterface.findAll();
    }

    public Player getSinglePlayer(long id) {
        return postInterface.findById(id).orElseThrow();
    }
}
