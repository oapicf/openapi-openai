package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;

@Canonical
class AuditLogActorApiKey {
    /* The tracking id of the API key. */
    String id

    enum TypeEnum {
    
        USER("user"),
        
        SERVICE_ACCOUNT("service_account")
    
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

    /* The type of API key. Can be either `user` or `service_account`. */
    TypeEnum type
    
    AuditLogActorUser user
    
    AuditLogActorServiceAccount serviceAccount
}
