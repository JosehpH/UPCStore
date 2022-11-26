package com.tf.upcstore.clientes.application.services;

import com.tf.upcstore.clientes.application.dtos.request.AgregarFavoritoRequest;
import com.tf.upcstore.clientes.application.dtos.request.EliminarFavoritoRequest;

import com.tf.upcstore.clientes.application.handlers.commands.AddFavoritoHandler;
import com.tf.upcstore.clientes.application.messages.commands.AddFavoritoCommand;
import com.tf.upcstore.clientes.application.messages.commands.EraseFavoritoCommand;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.tf.upcstore.clientes.infrastructure.persistance.repositories.FavoritosEntityRepository;
import java.util.concurrent.CompletableFuture;
import com.tf.upcstore.clientes.infrastructure.persistance.repositories.ProductEntityRepository;
import java.util.*;
@Service
public class ProductosApplicationService {

    private final CommandGateway commandGateway;

    @Autowired
    private  FavoritosEntityRepository favoritosRepository;
    @Autowired
    private ProductEntityRepository productosRepository;

    public ProductosApplicationService(CommandGateway commandGateway){
        this.commandGateway = commandGateway;

    }

    public CompletableFuture<String> addToFavoritos(AgregarFavoritoRequest agregarFavoritoRequest) {
        System.out.println("Se llamo");
        AddFavoritoCommand command = new AddFavoritoCommand( UUID.randomUUID().toString(),
                agregarFavoritoRequest.getIdProduct());
        AddFavoritoHandler handlerCommandFavoritos = new AddFavoritoHandler(command);
        return commandGateway.send(command);
    }

    public CompletableFuture<String> eraseFavorito(EliminarFavoritoRequest eliminarFavoritoRequest) {
        return commandGateway.send(new EraseFavoritoCommand
                (UUID.randomUUID().toString(),
                eliminarFavoritoRequest.getId()));
    }

    public  String getFavoritos(){
        //GetFavoritosHandler handlerFavoritos = new GetFavoritosHandler(favoritosRepository);
        return "Hola mundo";
    }
}
