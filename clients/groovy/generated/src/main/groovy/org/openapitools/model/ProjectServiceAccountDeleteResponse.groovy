package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectServiceAccountDeleteResponse {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_SERVICE_ACCOUNT_DELETED("organization.project.service_account.deleted")
    
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
    
    String id
    
    Boolean deleted
}
