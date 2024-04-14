package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
    /* The name of the function. */
    String name
    /* The arguments passed to the function. */
    String arguments
    /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    String output
}
