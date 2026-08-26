package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AssistantsApiResponseFormatOption;
import org.openapitools.server.model.AssistantsApiToolChoiceOption;
import org.openapitools.server.model.CreateRunRequestModel;
import org.openapitools.server.model.CreateThreadAndRunRequestToolResources;
import org.openapitools.server.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.server.model.CreateThreadRequest;
import org.openapitools.server.model.TruncationObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateThreadAndRunRequest   {

    private String assistantId;
    private CreateThreadRequest thread;
    private CreateRunRequestModel model;
    private String instructions;
    private List<CreateThreadAndRunRequestToolsInner> tools;
    private CreateThreadAndRunRequestToolResources toolResources;
    private Object metadata;
    private BigDecimal temperature = new BigDecimal("1");
    private BigDecimal topP = new BigDecimal("1");
    private Boolean stream;
    private Integer maxPromptTokens;
    private Integer maxCompletionTokens;
    private TruncationObject truncationStrategy;
    private AssistantsApiToolChoiceOption toolChoice;
    private Boolean parallelToolCalls = true;
    private AssistantsApiResponseFormatOption responseFormat;

    /**
     * Default constructor.
     */
    public CreateThreadAndRunRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateThreadAndRunRequest.
     *
     * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @param thread thread
     * @param model model
     * @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @param toolResources toolResources
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
     * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
     * @param stream If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
     * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
     * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
     * @param truncationStrategy truncationStrategy
     * @param toolChoice toolChoice
     * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @param responseFormat responseFormat
     */
    public CreateThreadAndRunRequest(
        String assistantId, 
        CreateThreadRequest thread, 
        CreateRunRequestModel model, 
        String instructions, 
        List<CreateThreadAndRunRequestToolsInner> tools, 
        CreateThreadAndRunRequestToolResources toolResources, 
        Object metadata, 
        BigDecimal temperature, 
        BigDecimal topP, 
        Boolean stream, 
        Integer maxPromptTokens, 
        Integer maxCompletionTokens, 
        TruncationObject truncationStrategy, 
        AssistantsApiToolChoiceOption toolChoice, 
        Boolean parallelToolCalls, 
        AssistantsApiResponseFormatOption responseFormat
    ) {
        this.assistantId = assistantId;
        this.thread = thread;
        this.model = model;
        this.instructions = instructions;
        this.tools = tools;
        this.toolResources = toolResources;
        this.metadata = metadata;
        this.temperature = temperature;
        this.topP = topP;
        this.stream = stream;
        this.maxPromptTokens = maxPromptTokens;
        this.maxCompletionTokens = maxCompletionTokens;
        this.truncationStrategy = truncationStrategy;
        this.toolChoice = toolChoice;
        this.parallelToolCalls = parallelToolCalls;
        this.responseFormat = responseFormat;
    }



    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * Get thread
     * @return thread
     */
    public CreateThreadRequest getThread() {
        return thread;
    }

    public void setThread(CreateThreadRequest thread) {
        this.thread = thread;
    }

    /**
     * Get model
     * @return model
     */
    public CreateRunRequestModel getModel() {
        return model;
    }

    public void setModel(CreateRunRequestModel model) {
        this.model = model;
    }

    /**
     * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @return tools
     */
    public List<CreateThreadAndRunRequestToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
        this.tools = tools;
    }

    /**
     * Get toolResources
     * @return toolResources
     */
    public CreateThreadAndRunRequestToolResources getToolResources() {
        return toolResources;
    }

    public void setToolResources(CreateThreadAndRunRequestToolResources toolResources) {
        this.toolResources = toolResources;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public BigDecimal getTopP() {
        return topP;
    }

    public void setTopP(BigDecimal topP) {
        this.topP = topP;
    }

    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
     * @return stream
     */
    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    /**
     * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
     * minimum: 256
     * @return maxPromptTokens
     */
    public Integer getMaxPromptTokens() {
        return maxPromptTokens;
    }

    public void setMaxPromptTokens(Integer maxPromptTokens) {
        this.maxPromptTokens = maxPromptTokens;
    }

    /**
     * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
     * minimum: 256
     * @return maxCompletionTokens
     */
    public Integer getMaxCompletionTokens() {
        return maxCompletionTokens;
    }

    public void setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
    }

    /**
     * Get truncationStrategy
     * @return truncationStrategy
     */
    public TruncationObject getTruncationStrategy() {
        return truncationStrategy;
    }

    public void setTruncationStrategy(TruncationObject truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }

    /**
     * Get toolChoice
     * @return toolChoice
     */
    public AssistantsApiToolChoiceOption getToolChoice() {
        return toolChoice;
    }

    public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
        this.toolChoice = toolChoice;
    }

    /**
     * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @return parallelToolCalls
     */
    public Boolean getParallelToolCalls() {
        return parallelToolCalls;
    }

    public void setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }

    /**
     * Get responseFormat
     * @return responseFormat
     */
    public AssistantsApiResponseFormatOption getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThreadAndRunRequest {\n");
        
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
        sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
        sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
        sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
        sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

