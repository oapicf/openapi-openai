package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogApiKeyUpdatedChangesRequested;

@Canonical
class AuditLogApiKeyUpdated {
    /* The tracking ID of the API key. */
    String id
    
    AuditLogApiKeyUpdatedChangesRequested changesRequested
}
