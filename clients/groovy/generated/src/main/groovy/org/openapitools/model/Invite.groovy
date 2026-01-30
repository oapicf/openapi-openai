package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InviteProjectsInner;

@Canonical
class Invite {

    enum ObjectEnum {
    
        ORGANIZATION_INVITE("organization.invite")
    
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

    /* The object type, which is always `organization.invite` */
    ObjectEnum _object
    /* The identifier, which can be referenced in API endpoints */
    String id
    /* The email address of the individual to whom the invite was sent */
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

    enum StatusEnum {
    
        ACCEPTED("accepted"),
        
        EXPIRED("expired"),
        
        PENDING("pending")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* `accepted`,`expired`, or `pending` */
    StatusEnum status
    /* The Unix timestamp (in seconds) of when the invite was sent. */
    Integer invitedAt
    /* The Unix timestamp (in seconds) of when the invite expires. */
    Integer expiresAt
    /* The Unix timestamp (in seconds) of when the invite was accepted. */
    Integer acceptedAt
    /* The projects that were granted membership upon acceptance of the invite. */
    List<InviteProjectsInner> projects = new ArrayList<>()
}
