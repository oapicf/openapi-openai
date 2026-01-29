package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;

@Canonical
class RunStepDetailsToolCallsCodeObjectCodeInterpreter {
    /* The input to the Code Interpreter tool call. */
    String input
    /* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
    List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = new ArrayList<>()
}
