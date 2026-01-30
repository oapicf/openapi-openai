package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InviteRequestProjectsInner;

@Canonical
class InviteRequest {
    /* Send an email to this address */
    String email

    enum RoleEnum {
    
        READER("reader"),
        
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

    /* `owner` or `reader` */
    RoleEnum role
    /* An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. */
    List<InviteRequestProjectsInner> projects = new ArrayList<>()
}
