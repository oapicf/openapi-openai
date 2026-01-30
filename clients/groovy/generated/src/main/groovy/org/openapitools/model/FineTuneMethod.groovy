package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethod;
import org.openapitools.model.FineTuneSupervisedMethod;

@Canonical
class FineTuneMethod {

    enum TypeEnum {
    
        SUPERVISED("supervised"),
        
        DPO("dpo")
    
        private final String value
    
        TypeEnum(String value) {
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

    /* The type of method. Is either `supervised` or `dpo`. */
    TypeEnum type
    
    FineTuneSupervisedMethod supervised
    
    FineTuneDPOMethod dpo
}
