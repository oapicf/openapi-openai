package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogProjectCreatedData;

@Canonical
class AuditLogProjectCreated {
    /* The project ID. */
    String id
    
    AuditLogProjectCreatedData data
}
