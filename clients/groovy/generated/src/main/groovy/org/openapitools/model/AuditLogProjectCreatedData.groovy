package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AuditLogProjectCreatedData {
    /* The project name. */
    String name
    /* The title of the project as seen on the dashboard. */
    String title
}
