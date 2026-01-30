package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogUserAddedData;

@Canonical
class AuditLogUserAdded {
    /* The user ID. */
    String id
    
    AuditLogUserAddedData data
}
