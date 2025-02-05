package cstore.registrousers.dominio.exceptions;

import lombok.Getter;

@Getter
public class ModelNotFoundException extends Exception{
    public ModelNotFoundException(String message){
        super(message);
    }
}
