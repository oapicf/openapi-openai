package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectUser;

@Canonical
class ProjectApiKeyOwner {

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

    /* `user` or `service_account` */
    TypeEnum type
    
    ProjectUser user
    
    ProjectServiceAccount serviceAccount
}
