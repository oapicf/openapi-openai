package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Model {
    /* The model identifier, which can be referenced in the API endpoints. */
    String id
    /* The Unix timestamp (in seconds) when the model was created. */
    Integer created

    enum ObjectEnum {
    
        MODEL("model")
    
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

    /* The object type, which is always \"model\". */
    ObjectEnum _object
    /* The organization that owns the model. */
    String ownedBy
}
