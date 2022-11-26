package com.tf.upcstore.clientes.application.messages.commands;


import com.tf.upcstore.clientes.domain.aggregates.product.IdProduct;

public class EraseFavoritoCommand extends BaseCommand<String>{
    private Long _id;
    public EraseFavoritoCommand(String idBase,Long id){
        super(idBase);
        this._id = id;
    }
    public Long getIdProduct(){return _id;}
}
