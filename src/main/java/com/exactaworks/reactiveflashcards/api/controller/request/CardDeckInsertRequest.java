package com.exactaworks.reactiveflashcards.api.controller.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Builder
@EqualsAndHashCode
@ToString
public class CardDeckInsertRequest {

    @NotEmpty
    private final String front;
    @NotEmpty
    private final String back;

    public CardDeckInsertRequest(@JsonProperty("front") final String front,
                                 @JsonProperty("back") final String back) {
        this.front = front;
        this.back = back;
    }
}
