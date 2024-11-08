package com.myblog_rest_api.myblog_rest_api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private Long fieldValue;

    public ResourceNotFoundException(String resourceName,String fieldName,Long fieldValue){

        super(String.format("%s not found with %s : '%s'", resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public Long getFieldValue() {
        return fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

     public String getResourceName() {
        return resourceName;
    }
}
