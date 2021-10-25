package com.exactaworks.reactiveflashcards.api.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Getter
@Builder
@EqualsAndHashCode
@ToString
public class DeckInsertRequest {

    @NotEmpty
    private final String name;
    @NotEmpty
    private final String description;
    @Valid
    @NotEmpty
    private final Set<CardDeckInsertRequest> cards;

    public DeckInsertRequest(@JsonProperty("name") final String name,
                             @JsonProperty("description") final String description,
                             @JsonProperty("cards") final Set<CardDeckInsertRequest> cards) {
        this.name = name;
        this.description = description;
        this.cards = cards;
    }
}
