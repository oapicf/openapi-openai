package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InviteProjectsInner {
    /* Project's public ID */
    String id

    enum RoleEnum {
    
        MEMBER("member"),
        
        OWNER("owner")
    
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

    /* Project membership role */
    RoleEnum role
}
