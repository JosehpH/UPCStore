package com.tf.upcstore.clientes.application.dtos.request;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;
import lombok.Data;
@Data

public class AgregarFavoritoRequest {
    private Long id;
    public  Long getIdProduct(){
        return id;
    }

}
