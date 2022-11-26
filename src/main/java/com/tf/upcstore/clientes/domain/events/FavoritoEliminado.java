package com.tf.upcstore.clientes.domain.events;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;
import lombok.Data;


public class FavoritoEliminado extends BaseEvent<String>{
    private Long _id;

    public FavoritoEliminado(String idBase,Long id) {
        super(idBase);
        _id = id;
    }
}
