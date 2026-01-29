package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SubmitToolOutputsRunRequestToolOutputsInner {
    /* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. */
    String toolCallId
    /* The output of the tool call to be submitted to continue the run. */
    String output
}
