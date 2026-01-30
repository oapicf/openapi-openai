package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ListAuditLogsEffectiveAtParameter {
    /* Return only events whose `effective_at` (Unix seconds) is greater than this value. */
    Integer gt
    /* Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. */
    Integer gte
    /* Return only events whose `effective_at` (Unix seconds) is less than this value. */
    Integer lt
    /* Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. */
    Integer lte
}
