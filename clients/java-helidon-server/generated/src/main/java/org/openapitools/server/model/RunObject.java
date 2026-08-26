package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AssistantObjectToolsInner;
import org.openapitools.server.model.AssistantsApiResponseFormatOption;
import org.openapitools.server.model.AssistantsApiToolChoiceOption;
import org.openapitools.server.model.RunCompletionUsage;
import org.openapitools.server.model.RunObjectIncompleteDetails;
import org.openapitools.server.model.RunObjectLastError;
import org.openapitools.server.model.RunObjectRequiredAction;
import org.openapitools.server.model.TruncationObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
public class RunObject   {

    private String id;

    /**
    * The object type, which is always `thread.run`.
    */
    public enum ObjectEnum {
        THREAD_RUN("thread.run");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private Integer createdAt;
    private String threadId;
    private String assistantId;

    /**
    * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
    */
    public enum StatusEnum {
        QUEUED("queued"),
        IN_PROGRESS("in_progress"),
        REQUIRES_ACTION("requires_action"),
        CANCELLING("cancelling"),
        CANCELLED("cancelled"),
        FAILED("failed"),
        COMPLETED("completed"),
        INCOMPLETE("incomplete"),
        EXPIRED("expired");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;
    private RunObjectRequiredAction requiredAction;
    private RunObjectLastError lastError;
    private Integer expiresAt;
    private Integer startedAt;
    private Integer cancelledAt;
    private Integer failedAt;
    private Integer completedAt;
    private RunObjectIncompleteDetails incompleteDetails;
    private String model;
    private String instructions;
    private List<AssistantObjectToolsInner> tools = new ArrayList<>();
    private Object metadata;
    private RunCompletionUsage usage;
    private BigDecimal temperature;
    private BigDecimal topP;
    private Integer maxPromptTokens;
    private Integer maxCompletionTokens;
    private TruncationObject truncationStrategy;
    private AssistantsApiToolChoiceOption toolChoice;
    private Boolean parallelToolCalls = true;
    private AssistantsApiResponseFormatOption responseFormat;

    /**
     * Default constructor.
     */
    public RunObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunObject.
     *
     * @param id The identifier, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;thread.run&#x60;.
     * @param createdAt The Unix timestamp (in seconds) for when the run was created.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @param status The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
     * @param requiredAction requiredAction
     * @param lastError lastError
     * @param expiresAt The Unix timestamp (in seconds) for when the run will expire.
     * @param startedAt The Unix timestamp (in seconds) for when the run was started.
     * @param cancelledAt The Unix timestamp (in seconds) for when the run was cancelled.
     * @param failedAt The Unix timestamp (in seconds) for when the run failed.
     * @param completedAt The Unix timestamp (in seconds) for when the run was completed.
     * @param incompleteDetails incompleteDetails
     * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @param usage usage
     * @param temperature The sampling temperature used for this run. If not set, defaults to 1.
     * @param topP The nucleus sampling value used for this run. If not set, defaults to 1.
     * @param maxPromptTokens The maximum number of prompt tokens specified to have been used over the course of the run. 
     * @param maxCompletionTokens The maximum number of completion tokens specified to have been used over the course of the run. 
     * @param truncationStrategy truncationStrategy
     * @param toolChoice toolChoice
     * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @param responseFormat responseFormat
     */
    public RunObject(
        String id, 
        ObjectEnum _object, 
        Integer createdAt, 
        String threadId, 
        String assistantId, 
        StatusEnum status, 
        RunObjectRequiredAction requiredAction, 
        RunObjectLastError lastError, 
        Integer expiresAt, 
        Integer startedAt, 
        Integer cancelledAt, 
        Integer failedAt, 
        Integer completedAt, 
        RunObjectIncompleteDetails incompleteDetails, 
        String model, 
        String instructions, 
        List<AssistantObjectToolsInner> tools, 
        Object metadata, 
        RunCompletionUsage usage, 
        BigDecimal temperature, 
        BigDecimal topP, 
        Integer maxPromptTokens, 
        Integer maxCompletionTokens, 
        TruncationObject truncationStrategy, 
        AssistantsApiToolChoiceOption toolChoice, 
        Boolean parallelToolCalls, 
        AssistantsApiResponseFormatOption responseFormat
    ) {
        this.id = id;
        this._object = _object;
        this.createdAt = createdAt;
        this.threadId = threadId;
        this.assistantId = assistantId;
        this.status = status;
        this.requiredAction = requiredAction;
        this.lastError = lastError;
        this.expiresAt = expiresAt;
        this.startedAt = startedAt;
        this.cancelledAt = cancelledAt;
        this.failedAt = failedAt;
        this.completedAt = completedAt;
        this.incompleteDetails = incompleteDetails;
        this.model = model;
        this.instructions = instructions;
        this.tools = tools;
        this.metadata = metadata;
        this.usage = usage;
        this.temperature = temperature;
        this.topP = topP;
        this.maxPromptTokens = maxPromptTokens;
        this.maxCompletionTokens = maxCompletionTokens;
        this.truncationStrategy = truncationStrategy;
        this.toolChoice = toolChoice;
        this.parallelToolCalls = parallelToolCalls;
        this.responseFormat = responseFormat;
    }



    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `thread.run`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The Unix timestamp (in seconds) for when the run was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get requiredAction
     * @return requiredAction
     */
    public RunObjectRequiredAction getRequiredAction() {
        return requiredAction;
    }

    public void setRequiredAction(RunObjectRequiredAction requiredAction) {
        this.requiredAction = requiredAction;
    }

    /**
     * Get lastError
     * @return lastError
     */
    public RunObjectLastError getLastError() {
        return lastError;
    }

    public void setLastError(RunObjectLastError lastError) {
        this.lastError = lastError;
    }

    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run was started.
     * @return startedAt
     */
    public Integer getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     * @return cancelledAt
     */
    public Integer getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Integer cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run failed.
     * @return failedAt
     */
    public Integer getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(Integer failedAt) {
        this.failedAt = failedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     * @return completedAt
     */
    public Integer getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Get incompleteDetails
     * @return incompleteDetails
     */
    public RunObjectIncompleteDetails getIncompleteDetails() {
        return incompleteDetails;
    }

    public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
        this.incompleteDetails = incompleteDetails;
    }

    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return tools
     */
    public List<AssistantObjectToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<AssistantObjectToolsInner> tools) {
        this.tools = tools;
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
     * Get usage
     * @return usage
     */
    public RunCompletionUsage getUsage() {
        return usage;
    }

    public void setUsage(RunCompletionUsage usage) {
        this.usage = usage;
    }

    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     * @return temperature
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * The nucleus sampling value used for this run. If not set, defaults to 1.
     * @return topP
     */
    public BigDecimal getTopP() {
        return topP;
    }

    public void setTopP(BigDecimal topP) {
        this.topP = topP;
    }

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run. 
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
     * The maximum number of completion tokens specified to have been used over the course of the run. 
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
        sb.append("class RunObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requiredAction: ").append(toIndentedString(requiredAction)).append("\n");
        sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
        sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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

