package com.exactaworks.reactiveflashcards.api.mapper;

import com.exactaworks.reactiveflashcards.api.controller.request.DeckInsertRequest;
import com.exactaworks.reactiveflashcards.api.controller.response.DeckInsertedResponse;
import com.exactaworks.reactiveflashcards.domain.document.DeckDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface DeckMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    DeckDocument toModel(final DeckInsertRequest request);

    DeckInsertedResponse toInsertedResponse(final DeckDocument document);

}
