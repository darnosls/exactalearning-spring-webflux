package com.exactaworks.reactiveflashcards.api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder(setterPrefix = "with")
@EqualsAndHashCode
@ToString
public class CardDeckInsertedResponse {


    private final String front;
    private final String back;

    public CardDeckInsertedResponse(@JsonProperty("front") final String front,
                                    @JsonProperty("back") final String back) {
        this.front = front;
        this.back = back;
    }
}
