package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccountApiKey;

@Canonical
class ProjectServiceAccountCreateResponse {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_SERVICE_ACCOUNT("organization.project.service_account")
    
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
    
    String name

    enum RoleEnum {
    
        MEMBER("member")
    
        private final String value
    
        RoleEnum(String value) {
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

    /* Service accounts can only have one role of type `member` */
    RoleEnum role
    
    Integer createdAt
    
    ProjectServiceAccountApiKey apiKey
}
