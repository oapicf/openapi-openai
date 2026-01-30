package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResponseFormatJsonObject;
import org.openapitools.model.ResponseFormatJsonSchema;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import org.openapitools.model.ResponseFormatText;

@Canonical
class AssistantsApiResponseFormatOption {

    enum TypeEnum {
    
        TEXT("text"),
        
        JSON_OBJECT("json_object"),
        
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

    /* The type of response format being defined: `text` */
    TypeEnum type
    
    ResponseFormatJsonSchemaJsonSchema jsonSchema
}
