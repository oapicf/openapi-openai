package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectUserCreateRequest {
    /* The ID of the user. */
    String userId

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
}
