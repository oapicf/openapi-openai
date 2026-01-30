package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequested;

@Canonical
class AuditLogOrganizationUpdated {
    /* The organization ID. */
    String id
    
    AuditLogOrganizationUpdatedChangesRequested changesRequested
}
