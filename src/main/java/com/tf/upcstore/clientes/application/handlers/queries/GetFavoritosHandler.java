package com.tf.upcstore.clientes.application.handlers.queries;

import com.tf.upcstore.clientes.infrastructure.persistance.repositories.FavoritosEntityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@Slf4j
public class GetFavoritosHandler {
    @Autowired
    private  FavoritosEntityRepository favoritosRepository;

    public ResponseEntity<Object>geALLtFavoritos() {
        return (ResponseEntity<Object>)favoritosRepository.findAll();
    }
}
