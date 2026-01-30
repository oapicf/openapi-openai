package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorUser;

@Canonical
class AuditLogActorSession {
    
    AuditLogActorUser user
    /* The IP address from which the action was performed. */
    String ipAddress
}
