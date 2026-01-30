package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectUser {

    enum ObjectEnum {
    
        ORGANIZATION_PROJECT_USER("organization.project.user")
    
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

    /* The object type, which is always `organization.project.user` */
    ObjectEnum _object
    /* The identifier, which can be referenced in API endpoints */
    String id
    /* The name of the user */
    String name
    /* The email address of the user */
    String email

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
    /* The Unix timestamp (in seconds) of when the project was added. */
    Integer addedAt
}
