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
 * OASCreateRunRequest
 */
public class OASCreateRunRequest implements OAS.MappedProperties {
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @return assistantId
     */
    public String assistantId { get; set; }

    /**
     * Get model
     * @return model
     */
    public OASCreateRunRequestModel model { get; set; }

    /**
     * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @return instructions
     */
    public String instructions { get; set; }

    /**
     * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
     * @return additionalInstructions
     */
    public String additionalInstructions { get; set; }

    /**
     * Adds additional messages to the thread before creating the run.
     * @return additionalMessages
     */
    public List<OASCreateMessageRequest> additionalMessages { get; set; }

    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @return tools
     */
    public List<OASAssistantObjectToolsInner> tools { get; set; }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.\n
     * @return metadata
     */
    public Object metadata { get; set; }

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.\n
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public Double temperature { get; set; }

    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.\n
     * @return stream
     */
    public Boolean stream { get; set; }

    /**
     * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.\n
     * minimum: 256
     * @return maxPromptTokens
     */
    public Integer maxPromptTokens { get; set; }

    /**
     * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.\n
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
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
        'assistant_id' => 'assistantId',
        'additional_instructions' => 'additionalInstructions',
        'additional_messages' => 'additionalMessages',
        'max_prompt_tokens' => 'maxPromptTokens',
        'max_completion_tokens' => 'maxCompletionTokens',
        'truncation_strategy' => 'truncationStrategy',
        'tool_choice' => 'toolChoice',
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreateRunRequest() {
        additionalMessages = new List<OASCreateMessageRequest>();
        tools = new List<OASAssistantObjectToolsInner>();
        temperature = 1;
    }

    public static OASCreateRunRequest getExample() {
        OASCreateRunRequest createRunRequest = new OASCreateRunRequest();
          createRunRequest.assistantId = '';
          createRunRequest.model = OASCreateRunRequestModel.getExample();
          createRunRequest.instructions = '';
          createRunRequest.additionalInstructions = '';
          createRunRequest.additionalMessages = new List<OASCreateMessageRequest>{OASCreateMessageRequest.getExample()};
          createRunRequest.tools = new List<OASAssistantObjectToolsInner>{OASAssistantObjectToolsInner.getExample()};
          createRunRequest.metadata = null;
          createRunRequest.temperature = 1;
          createRunRequest.stream = true;
          createRunRequest.maxPromptTokens = 0;
          createRunRequest.maxCompletionTokens = 0;
          createRunRequest.truncationStrategy = OASTruncationObject.getExample();
          createRunRequest.toolChoice = OASAssistantsApiToolChoiceOption.getExample();
          createRunRequest.responseFormat = OASAssistantsApiResponseFormatOption.getExample();
        return createRunRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateRunRequest) {           
            OASCreateRunRequest createRunRequest = (OASCreateRunRequest) obj;
            return this.assistantId == createRunRequest.assistantId
                && this.model == createRunRequest.model
                && this.instructions == createRunRequest.instructions
                && this.additionalInstructions == createRunRequest.additionalInstructions
                && this.additionalMessages == createRunRequest.additionalMessages
                && this.tools == createRunRequest.tools
                && this.metadata == createRunRequest.metadata
                && this.temperature == createRunRequest.temperature
                && this.stream == createRunRequest.stream
                && this.maxPromptTokens == createRunRequest.maxPromptTokens
                && this.maxCompletionTokens == createRunRequest.maxCompletionTokens
                && this.truncationStrategy == createRunRequest.truncationStrategy
                && this.toolChoice == createRunRequest.toolChoice
                && this.responseFormat == createRunRequest.responseFormat;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (assistantId == null ? 0 : System.hashCode(assistantId));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (instructions == null ? 0 : System.hashCode(instructions));
        hashCode = (17 * hashCode) + (additionalInstructions == null ? 0 : System.hashCode(additionalInstructions));
        hashCode = (17 * hashCode) + (additionalMessages == null ? 0 : System.hashCode(additionalMessages));
        hashCode = (17 * hashCode) + (tools == null ? 0 : System.hashCode(tools));
        hashCode = (17 * hashCode) + (metadata == null ? 0 : System.hashCode(metadata));
        hashCode = (17 * hashCode) + (temperature == null ? 0 : System.hashCode(temperature));
        hashCode = (17 * hashCode) + (stream == null ? 0 : System.hashCode(stream));
        hashCode = (17 * hashCode) + (maxPromptTokens == null ? 0 : System.hashCode(maxPromptTokens));
        hashCode = (17 * hashCode) + (maxCompletionTokens == null ? 0 : System.hashCode(maxCompletionTokens));
        hashCode = (17 * hashCode) + (truncationStrategy == null ? 0 : System.hashCode(truncationStrategy));
        hashCode = (17 * hashCode) + (toolChoice == null ? 0 : System.hashCode(toolChoice));
        hashCode = (17 * hashCode) + (responseFormat == null ? 0 : System.hashCode(responseFormat));
        return hashCode;
    }
}
