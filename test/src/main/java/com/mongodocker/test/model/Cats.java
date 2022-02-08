package com.mongodocker.test.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class Cats {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String race;
}
