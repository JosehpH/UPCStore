package com.tf.upcstore.clientes.domain.events;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;

public class FavoritoAgregado extends BaseEvent<String>{
    private Long _id;

    public FavoritoAgregado(Long id,String _idBase) {
        super(_idBase);
        _id = id;
    }
    public Long getIdProduct(){return _id;}
}

