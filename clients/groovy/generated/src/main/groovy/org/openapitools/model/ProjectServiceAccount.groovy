package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectServiceAccount {

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

    /* The object type, which is always `organization.project.service_account` */
    ObjectEnum _object
    /* The identifier, which can be referenced in API endpoints */
    String id
    /* The name of the service account */
    String name

    enum RoleEnum {
    
        OWNER("owner"),
        
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

    /* `owner` or `member` */
    RoleEnum role
    /* The Unix timestamp (in seconds) of when the service account was created */
    Integer createdAt
}
