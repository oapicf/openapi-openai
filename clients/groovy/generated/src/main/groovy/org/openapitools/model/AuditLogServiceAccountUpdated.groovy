package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogServiceAccountUpdatedChangesRequested;

@Canonical
class AuditLogServiceAccountUpdated {
    /* The service account ID. */
    String id
    
    AuditLogServiceAccountUpdatedChangesRequested changesRequested
}
