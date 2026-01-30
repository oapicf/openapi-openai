package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogInviteSentData;

@Canonical
class AuditLogInviteSent {
    /* The ID of the invite. */
    String id
    
    AuditLogInviteSentData data
}
