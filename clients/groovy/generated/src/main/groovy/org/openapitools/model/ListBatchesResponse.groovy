package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Batch;

@Canonical
class ListBatchesResponse {
    
    List<Batch> data = new ArrayList<>()
    
    String firstId
    
    String lastId
    
    Boolean hasMore

    enum ObjectEnum {
    
        LIST("list")
    
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
