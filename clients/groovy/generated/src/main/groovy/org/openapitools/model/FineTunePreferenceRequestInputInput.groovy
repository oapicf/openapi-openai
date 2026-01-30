package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;

@Canonical
class FineTunePreferenceRequestInputInput {
    
    List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>()
    /* A list of tools the model may generate JSON inputs for. */
    List<ChatCompletionTool> tools = new ArrayList<>()
    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    Boolean parallelToolCalls = true
}
