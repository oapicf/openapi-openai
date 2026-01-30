package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogUserAddedData {
    /* The role of the user. Is either `owner` or `member`. */
    String role
}
