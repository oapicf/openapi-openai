package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogInviteSentData {
    /* The email invited to the organization. */
    String email
    /* The role the email was invited to be. Is either `owner` or `member`. */
    String role
}
