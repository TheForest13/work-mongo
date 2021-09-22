package com.theforest.workmongo.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "player")
public class Player {
    @Id
//    private ObjectId _id;
    private String id;
    private String skill;
    private String nickname;
}
