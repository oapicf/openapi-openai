package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;

@Canonical
class ResponseFormatJsonSchema {

    enum TypeEnum {
    
        JSON_SCHEMA("json_schema")
    
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

    /* The type of response format being defined: `json_schema` */
    TypeEnum type
    
    ResponseFormatJsonSchemaJsonSchema jsonSchema
}
