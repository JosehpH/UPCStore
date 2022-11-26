package com.tf.upcstore.clientes.interfaces.rest;

import com.tf.upcstore.clientes.application.dtos.request.AgregarFavoritoRequest;
import com.tf.upcstore.clientes.application.dtos.request.EliminarFavoritoRequest;
import com.tf.upcstore.clientes.application.services.ProductosApplicationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/favoritos")
public class ClientsController {

    private  final ProductosApplicationService productosApplicationService;

    ClientsController(ProductosApplicationService favoritosApplicationService){
        this.productosApplicationService = favoritosApplicationService;
    }
    @ApiOperation("Agregar producto a favoritos")
    @PostMapping("/agregar")
    public  ResponseEntity<String> AgregarFavorito(@RequestBody AgregarFavoritoRequest request){
        System.out.println("Entro a agregar");
        try{
            var response = productosApplicationService.addToFavoritos(request);
            System.out.println("Se llamo");
            System.out.println(request.getId());
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            System.out.println("No Se llamo");
            return new ResponseEntity<>("Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @ApiOperation("Eliminar producto de favoritos")
    @PostMapping("/eliminar")
    public  ResponseEntity<String> EliminarFavorito(@RequestBody EliminarFavoritoRequest request){
        try{
            CompletableFuture<String>response = productosApplicationService.eraseFavorito(request);
            return new ResponseEntity<>(response.get(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("Obtener favoritos")
    @GetMapping("/ver")
    public String getAllProductos(){
        return productosApplicationService.getFavoritos();
    }

}