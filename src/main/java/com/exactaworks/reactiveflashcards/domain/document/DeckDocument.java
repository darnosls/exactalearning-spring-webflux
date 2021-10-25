package com.exactaworks.reactiveflashcards.domain.document;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;
import java.util.Set;

@Document(collection = "decks")
@Data
public class DeckDocument {

    @Id
    private String id;
    private String name;
    private String description;
    private Set<Card> cards;
    @CreatedDate
    private OffsetDateTime createdAt;
    @LastModifiedDate
    private OffsetDateTime updatedAt;

}
