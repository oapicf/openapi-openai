package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SubmitToolOutputsRunRequestToolOutputsInner;

@Canonical
class SubmitToolOutputsRunRequest {
    /* A list of tools for which the outputs are being submitted. */
    List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>()
    /* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    Boolean stream
}
