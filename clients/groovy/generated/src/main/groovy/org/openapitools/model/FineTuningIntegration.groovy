package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;

@Canonical
class FineTuningIntegration {

    enum TypeEnum {
    
        WANDB("wandb")
    
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

    /* The type of the integration being enabled for the fine-tuning job */
    TypeEnum type
    
    CreateFineTuningJobRequestIntegrationsInnerWandb wandb
}
