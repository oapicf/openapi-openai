package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequestedSettings;

@Canonical
class AuditLogOrganizationUpdatedChangesRequested {
    /* The organization title. */
    String title
    /* The organization description. */
    String description
    /* The organization name. */
    String name
    
    AuditLogOrganizationUpdatedChangesRequestedSettings settings
}
