package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.CreateRunRequestModel;
import org.openapitools.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.TruncationObject;

@Canonical
class CreateThreadAndRunRequest {
    /* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
    String assistantId
    
    CreateThreadRequest thread
    
    CreateRunRequestModel model
    /* Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. */
    String instructions
    /* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
    List<CreateThreadAndRunRequestToolsInner> tools
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    Object metadata
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    BigDecimal temperature = new BigDecimal("1")
    /* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    Boolean stream
    /* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
    Integer maxPromptTokens
    /* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  */
    Integer maxCompletionTokens
    
    TruncationObject truncationStrategy
    
    AssistantsApiToolChoiceOption toolChoice
    
    AssistantsApiResponseFormatOption responseFormat
}
