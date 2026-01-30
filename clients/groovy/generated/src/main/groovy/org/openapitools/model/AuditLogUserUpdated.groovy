package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogUserUpdatedChangesRequested;

@Canonical
class AuditLogUserUpdated {
    /* The project ID. */
    String id
    
    AuditLogUserUpdatedChangesRequested changesRequested
}
