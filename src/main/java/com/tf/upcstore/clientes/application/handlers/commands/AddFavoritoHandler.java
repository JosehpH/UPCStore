package com.tf.upcstore.clientes.application.handlers.commands;

import com.tf.upcstore.clientes.application.mappers.ProductMapper;
import com.tf.upcstore.clientes.application.messages.commands.AddFavoritoCommand;
import com.tf.upcstore.clientes.domain.events.FavoritoAgregado;
import com.tf.upcstore.clientes.infrastructure.persistance.entities.FavoritosEntity;
import com.tf.upcstore.clientes.infrastructure.persistance.repositories.FavoritosEntityRepository;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class AddFavoritoHandler {
    @Autowired
    FavoritosEntityRepository favoritoRepository;

    @AggregateIdentifier
    private String productId;
    private String status;
    @CommandHandler
    public AddFavoritoHandler(AddFavoritoCommand agregarFavoritoCommand){
        log.info("Agregar a favoritos recibido");
        FavoritosEntity favorito = new FavoritosEntity();
        favorito.setFavorito(agregarFavoritoCommand.getIdProduct());
        favoritoRepository.save(favorito);
        AggregateLifecycle.apply(new FavoritoAgregado(
                agregarFavoritoCommand.getIdProduct(), agregarFavoritoCommand.getId()));
    }
    @EventSourcingHandler
    public void on(FavoritoAgregado favoritoAgregadoEvent){
        log.info("Producto agregado a favoritos");
        this.status = "AGREGADO";
        this.productId = favoritoAgregadoEvent.getIdProduct().toString();
    }
}
