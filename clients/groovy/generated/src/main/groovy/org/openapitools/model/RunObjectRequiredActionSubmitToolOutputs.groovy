package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunToolCallObject;

@Canonical
class RunObjectRequiredActionSubmitToolOutputs {
    /* A list of the relevant tool calls. */
    List<RunToolCallObject> toolCalls = new ArrayList<>()
}
