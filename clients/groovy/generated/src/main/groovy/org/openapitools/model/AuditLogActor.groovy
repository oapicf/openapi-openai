package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;

@Canonical
class AuditLogActor {

    enum TypeEnum {
    
        SESSION("session"),
        
        API_KEY("api_key")
    
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

    /* The type of actor. Is either `session` or `api_key`. */
    TypeEnum type
    
    AuditLogActorSession session
    
    AuditLogActorApiKey apiKey
}
