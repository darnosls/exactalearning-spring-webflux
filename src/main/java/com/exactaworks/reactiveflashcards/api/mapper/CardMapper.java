package com.exactaworks.reactiveflashcards.api.mapper;

import com.exactaworks.reactiveflashcards.api.controller.request.CardDeckInsertRequest;
import com.exactaworks.reactiveflashcards.api.controller.response.CardDeckInsertedResponse;
import com.exactaworks.reactiveflashcards.domain.document.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card toModel(final CardDeckInsertRequest request);

    CardDeckInsertedResponse toResponseInserted(final Card card);

}