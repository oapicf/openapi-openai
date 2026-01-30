package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogActorUser {
    /* The user id. */
    String id
    /* The user email. */
    String email
}
