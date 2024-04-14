package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunToolCallObjectFunction {
    /* The name of the function. */
    String name
    /* The arguments that the model expects you to pass to the function. */
    String arguments
}
