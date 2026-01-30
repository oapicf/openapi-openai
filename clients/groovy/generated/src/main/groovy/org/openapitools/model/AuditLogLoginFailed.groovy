package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogLoginFailed {
    /* The error code of the failure. */
    String errorCode
    /* The error message of the failure. */
    String errorMessage
}
