package com.exactaworks.reactiveflashcards.api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Builder(setterPrefix = "with")
@EqualsAndHashCode
@ToString
public class DeckInsertedResponse {


    private final String id;
    private final String name;
    private final String description;
    private final Set<CardDeckInsertedResponse> cards;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;

    public DeckInsertedResponse(@JsonProperty("id") final String id,
                                @JsonProperty("name") final String name,
                                @JsonProperty("description") final String description,
                                @JsonProperty("cards") final Set<CardDeckInsertedResponse> cards,
                                @JsonProperty("createdAt") final OffsetDateTime createdAt,
                                @JsonProperty("updatedAt") final OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cards = cards;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}