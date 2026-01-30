package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InviteDeleteResponse {

    enum ObjectEnum {
    
        ORGANIZATION_INVITE_DELETED("organization.invite.deleted")
    
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

    /* The object type, which is always `organization.invite.deleted` */
    ObjectEnum _object
    
    String id
    
    Boolean deleted
}
