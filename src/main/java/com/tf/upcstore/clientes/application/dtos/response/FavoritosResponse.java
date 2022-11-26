package com.tf.upcstore.clientes.application.dtos.response;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FavoritosResponse {
    private ArrayList<ProductResponse> favoritosResponse;
}
