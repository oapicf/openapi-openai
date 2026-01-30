package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogProjectUpdatedChangesRequested;

@Canonical
class AuditLogProjectUpdated {
    /* The project ID. */
    String id
    
    AuditLogProjectUpdatedChangesRequested changesRequested
}
