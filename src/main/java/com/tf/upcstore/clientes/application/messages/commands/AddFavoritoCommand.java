package com.tf.upcstore.clientes.application.messages.commands;

import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;

public class AddFavoritoCommand extends BaseCommand<String> {
    private Long _id;
    public AddFavoritoCommand(String idComand, Long _id){
        super(idComand);
        this._id=_id;
    }
    public Long getIdProduct(){return _id;}
}
