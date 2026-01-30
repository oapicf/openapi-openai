package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class User {

    enum ObjectEnum {
    
        ORGANIZATION_USER("organization.user")
    
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

    /* The object type, which is always `organization.user` */
    ObjectEnum _object
    /* The identifier, which can be referenced in API endpoints */
    String id
    /* The name of the user */
    String name
    /* The email address of the user */
    String email

    enum RoleEnum {
    
        OWNER("owner"),
        
        READER("reader")
    
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

    /* `owner` or `reader` */
    RoleEnum role
    /* The Unix timestamp (in seconds) of when the user was added. */
    Integer addedAt
}
