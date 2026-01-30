package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeResponseStatusDetailsError {
    /* The type of error. */
    String type
    /* Error code, if any. */
    String code
}
