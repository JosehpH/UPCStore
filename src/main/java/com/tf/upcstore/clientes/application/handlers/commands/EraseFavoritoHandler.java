package com.tf.upcstore.clientes.application.handlers.commands;

import com.tf.upcstore.clientes.application.messages.commands.AddFavoritoCommand;
import com.tf.upcstore.clientes.application.messages.commands.EraseFavoritoCommand;
import com.tf.upcstore.clientes.domain.events.FavoritoAgregado;
import com.tf.upcstore.clientes.domain.events.FavoritoEliminado;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;

@Slf4j
public class EraseFavoritoHandler {
    @AggregateIdentifier
    private String productId;
    private String status;
    @CommandHandler
    public EraseFavoritoHandler(EraseFavoritoCommand eraseFavoritoCommand){
        log.info("eliminar de favoritos recibido");
        AggregateLifecycle.apply(new FavoritoEliminado(
                eraseFavoritoCommand.getId(),
                eraseFavoritoCommand.getIdProduct()));
    }
    @EventSourcingHandler
    public void on(FavoritoAgregado favoritoAgregadoEvent){
        log.info("Producto eliminado de favoritos");
        this.status = "Eliminado";
        this.productId = favoritoAgregadoEvent.getIdProduct().toString();
    }
}
