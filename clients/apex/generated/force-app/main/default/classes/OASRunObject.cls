/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
public class OASRunObject implements OAS.MappedProperties {
    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String id { get; set; }

    /**
     * The object type, which is always `thread.run`.
     */
    public enum RObjectEnum {
        THREAD_RUN
    }

    /**
     * The object type, which is always `thread.run`.
     * @return r_object
     */
    public RObjectEnum r_object { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run was created.
     * @return createdAt
     */
    public Integer createdAt { get; set; }

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @return threadId
     */
    public String threadId { get; set; }

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @return assistantId
     */
    public String assistantId { get; set; }

    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     */
    public enum StatusEnum {
        QUEUED,
        IN_PROGRESS,
        REQUIRES_ACTION,
        CANCELLING,
        CANCELLED,
        FAILED,
        COMPLETED,
        EXPIRED
    }

    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     * @return status
     */
    public StatusEnum status { get; set; }

    /**
     * Get requiredAction
     * @return requiredAction
     */
    public OASRunObjectRequiredAction requiredAction { get; set; }

    /**
     * Get lastError
     * @return lastError
     */
    public OASRunObjectLastError lastError { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     * @return expiresAt
     */
    public Integer expiresAt { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run was started.
     * @return startedAt
     */
    public Integer startedAt { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     * @return cancelledAt
     */
    public Integer cancelledAt { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run failed.
     * @return failedAt
     */
    public Integer failedAt { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     * @return completedAt
     */
    public Integer completedAt { get; set; }

    /**
     * Get incompleteDetails
     * @return incompleteDetails
     */
    public OASRunObjectIncompleteDetails incompleteDetails { get; set; }

    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return model
     */
    public String model { get; set; }

    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return instructions
     */
    public String instructions { get; set; }

    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return tools
     */
    public List<OASAssistantObjectToolsInner> tools { get; set; }

    /**
     * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
     * @return fileIds
     */
    public List<String> fileIds { get; set; }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.\n
     * @return metadata
     */
    public Object metadata { get; set; }

    /**
     * Get usage
     * @return usage
     */
    public OASRunCompletionUsage usage { get; set; }

    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     * @return temperature
     */
    public Double temperature { get; set; }

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.\n
     * minimum: 256
     * @return maxPromptTokens
     */
    public Integer maxPromptTokens { get; set; }

    /**
     * The maximum number of completion tokens specified to have been used over the course of the run.\n
     * minimum: 256
     * @return maxCompletionTokens
     */
    public Integer maxCompletionTokens { get; set; }

    /**
     * Get truncationStrategy
     * @return truncationStrategy
     */
    public OASTruncationObject truncationStrategy { get; set; }

    /**
     * Get toolChoice
     * @return toolChoice
     */
    public OASAssistantsApiToolChoiceOption toolChoice { get; set; }

    /**
     * Get responseFormat
     * @return responseFormat
     */
    public OASAssistantsApiResponseFormatOption responseFormat { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'thread_id' => 'threadId',
        'assistant_id' => 'assistantId',
        'required_action' => 'requiredAction',
        'last_error' => 'lastError',
        'expires_at' => 'expiresAt',
        'started_at' => 'startedAt',
        'cancelled_at' => 'cancelledAt',
        'failed_at' => 'failedAt',
        'completed_at' => 'completedAt',
        'incomplete_details' => 'incompleteDetails',
        'file_ids' => 'fileIds',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASRunObject() {
        tools = new List<OASAssistantObjectToolsInner>();
        fileIds = new List<String>();
    }

    public static OASRunObject getExample() {
        OASRunObject runObject = new OASRunObject();
          runObject.id = '';
          runObject.r_object = RObjectEnum.THREAD_RUN;
          runObject.createdAt = 0;
          runObject.threadId = '';
          runObject.assistantId = '';
          runObject.status = StatusEnum.QUEUED;
          runObject.requiredAction = OASRunObjectRequiredAction.getExample();
          runObject.lastError = OASRunObjectLastError.getExample();
          runObject.expiresAt = 0;
          runObject.startedAt = 0;
          runObject.cancelledAt = 0;
          runObject.failedAt = 0;
          runObject.completedAt = 0;
          runObject.incompleteDetails = OASRunObjectIncompleteDetails.getExample();
          runObject.model = '';
          runObject.instructions = '';
          runObject.tools = new List<OASAssistantObjectToolsInner>{OASAssistantObjectToolsInner.getExample()};
          runObject.fileIds = new List<String>{''};
          runObject.metadata = null;
          runObject.usage = OASRunCompletionUsage.getExample();
          runObject.temperature = 1.3579;
          runObject.maxPromptTokens = 0;
          runObject.maxCompletionTokens = 0;
          runObject.truncationStrategy = OASTruncationObject.getExample();
          runObject.toolChoice = OASAssistantsApiToolChoiceOption.getExample();
          runObject.responseFormat = OASAssistantsApiResponseFormatOption.getExample();
        return runObject;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunObject) {           
            OASRunObject runObject = (OASRunObject) obj;
            return this.id == runObject.id
                && this.r_object == runObject.r_object
                && this.createdAt == runObject.createdAt
                && this.threadId == runObject.threadId
                && this.assistantId == runObject.assistantId
                && this.status == runObject.status
                && this.requiredAction == runObject.requiredAction
                && this.lastError == runObject.lastError
                && this.expiresAt == runObject.expiresAt
                && this.startedAt == runObject.startedAt
                && this.cancelledAt == runObject.cancelledAt
                && this.failedAt == runObject.failedAt
                && this.completedAt == runObject.completedAt
                && this.incompleteDetails == runObject.incompleteDetails
                && this.model == runObject.model
                && this.instructions == runObject.instructions
                && this.tools == runObject.tools
                && this.fileIds == runObject.fileIds
                && this.metadata == runObject.metadata
                && this.usage == runObject.usage
                && this.temperature == runObject.temperature
                && this.maxPromptTokens == runObject.maxPromptTokens
                && this.maxCompletionTokens == runObject.maxCompletionTokens
                && this.truncationStrategy == runObject.truncationStrategy
                && this.toolChoice == runObject.toolChoice
                && this.responseFormat == runObject.responseFormat;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (threadId == null ? 0 : System.hashCode(threadId));
        hashCode = (17 * hashCode) + (assistantId == null ? 0 : System.hashCode(assistantId));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (requiredAction == null ? 0 : System.hashCode(requiredAction));
        hashCode = (17 * hashCode) + (lastError == null ? 0 : System.hashCode(lastError));
        hashCode = (17 * hashCode) + (expiresAt == null ? 0 : System.hashCode(expiresAt));
        hashCode = (17 * hashCode) + (startedAt == null ? 0 : System.hashCode(startedAt));
        hashCode = (17 * hashCode) + (cancelledAt == null ? 0 : System.hashCode(cancelledAt));
        hashCode = (17 * hashCode) + (failedAt == null ? 0 : System.hashCode(failedAt));
        hashCode = (17 * hashCode) + (completedAt == null ? 0 : System.hashCode(completedAt));
        hashCode = (17 * hashCode) + (incompleteDetails == null ? 0 : System.hashCode(incompleteDetails));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (instructions == null ? 0 : System.hashCode(instructions));
        hashCode = (17 * hashCode) + (tools == null ? 0 : System.hashCode(tools));
        hashCode = (17 * hashCode) + (fileIds == null ? 0 : System.hashCode(fileIds));
        hashCode = (17 * hashCode) + (metadata == null ? 0 : System.hashCode(metadata));
        hashCode = (17 * hashCode) + (usage == null ? 0 : System.hashCode(usage));
        hashCode = (17 * hashCode) + (temperature == null ? 0 : System.hashCode(temperature));
        hashCode = (17 * hashCode) + (maxPromptTokens == null ? 0 : System.hashCode(maxPromptTokens));
        hashCode = (17 * hashCode) + (maxCompletionTokens == null ? 0 : System.hashCode(maxCompletionTokens));
        hashCode = (17 * hashCode) + (truncationStrategy == null ? 0 : System.hashCode(truncationStrategy));
        hashCode = (17 * hashCode) + (toolChoice == null ? 0 : System.hashCode(toolChoice));
        hashCode = (17 * hashCode) + (responseFormat == null ? 0 : System.hashCode(responseFormat));
        return hashCode;
    }
}

