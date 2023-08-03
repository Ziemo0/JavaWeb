package com.manUtd.manUtdPage.repository;

import com.manUtd.manUtdPage.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostInterface extends JpaRepository<Player, Long> {
}
