package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogUserUpdatedChangesRequested {
    /* The role of the user. Is either `owner` or `member`. */
    String role
}
