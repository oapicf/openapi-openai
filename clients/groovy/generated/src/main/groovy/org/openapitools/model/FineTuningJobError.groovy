package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FineTuningJobError {
    /* A machine-readable error code. */
    String code
    /* A human-readable error message. */
    String message
    /* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */
    String param
}
