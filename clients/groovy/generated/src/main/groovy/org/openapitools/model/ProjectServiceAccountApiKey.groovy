package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectServiceAccountApiKey {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_SERVICE_ACCOUNT_API_KEY("organization.project.service_account.api_key")
    
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

    /* The object type, which is always `organization.project.service_account.api_key` */
    ObjectEnum _object
    
    String value
    
    String name
    
    Integer createdAt
    
    String id
}
