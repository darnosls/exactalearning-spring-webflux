package com.exactaworks.reactiveflashcards.domain.service;

import com.exactaworks.reactiveflashcards.domain.document.DeckDocument;
import com.exactaworks.reactiveflashcards.domain.repository.DeckRepository;
import com.exactaworks.reactiveflashcards.domain.service.query.DeckQueryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class DeckService {

    private final DeckRepository deckRepository;
    private final DeckQueryService deckQueryService;

    public Mono<DeckDocument> save(final DeckDocument document){
        return deckRepository.save(document)
                .doFirst(() -> log.info("==== saving a follow document {}", document));
    }

    public Mono<DeckDocument> update(final DeckDocument document){
        return deckQueryService.findById(document.getId())
                .flatMap(deck->deckRepository.save(document))
                .doFirst(() -> log.info("==== updating a follow deck {}", document));
    }

    public Mono<Void> delete(final String id){
        return deckQueryService.findById(id)
                .flatMap(deck -> deckRepository.deleteById(deck.getId()))
                .doFirst(() -> log.info("==== deleting a document with follow id {}", id));
    }

}
