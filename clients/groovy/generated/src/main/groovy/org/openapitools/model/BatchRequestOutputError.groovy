package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BatchRequestOutputError {
    /* A machine-readable error code. */
    String code
    /* A human-readable error message. */
    String message
}
