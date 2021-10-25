package com.exactaworks.reactiveflashcards.domain.service.query;

import com.exactaworks.reactiveflashcards.domain.document.DeckDocument;
import com.exactaworks.reactiveflashcards.domain.repository.DeckRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@AllArgsConstructor
public class DeckQueryService {

    private final DeckRepository deckRepository;

    public Mono<DeckDocument> findById(final String id){
        return deckRepository.findById(id)
                .doFirst(() -> log.info("==== getting deck with id {}", id));
    }

    public Flux<DeckDocument> findAll(){
        return deckRepository.findAll()
                .doFirst(() -> log.info("==== getting all decks"));
    }

}