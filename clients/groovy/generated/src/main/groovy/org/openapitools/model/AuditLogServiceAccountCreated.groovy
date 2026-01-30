package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogServiceAccountCreatedData;

@Canonical
class AuditLogServiceAccountCreated {
    /* The service account ID. */
    String id
    
    AuditLogServiceAccountCreatedData data
}
