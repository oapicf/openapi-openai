package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeleteVectorStoreResponse {
    
    String id
    
    Boolean deleted

    enum ObjectEnum {
    
        VECTOR_STORE_DELETED("vector_store.deleted")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ObjectEnum _object
}
