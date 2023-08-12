package com.GlobalExceptionHandling.Exception;

import lombok.Data;


public class NoSuchCustomerExistsException extends RuntimeException{
    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public long getFieldValue() {
        return fieldValue;
    }
    public void setFieldValue(long fieldValue) {
        this.fieldValue = fieldValue;
    }
    String resourceName;
    String fieldName;
    long fieldValue;
    public NoSuchCustomerExistsException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s not found with %s: ,%s",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue =fieldValue;
    }

}
