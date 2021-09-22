package com.theforest.workmongo.repository;

import com.theforest.workmongo.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
