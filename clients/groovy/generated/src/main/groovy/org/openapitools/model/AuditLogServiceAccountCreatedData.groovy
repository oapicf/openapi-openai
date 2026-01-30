package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogServiceAccountCreatedData {
    /* The role of the service account. Is either `owner` or `member`. */
    String role
}
