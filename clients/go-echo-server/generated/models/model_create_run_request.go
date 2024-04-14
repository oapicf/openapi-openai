package models

type CreateRunRequest struct {

	// The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
	AssistantId string `json:"assistant_id"`

	Model *CreateRunRequestModel `json:"model,omitempty"`

	// Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
	Instructions *string `json:"instructions,omitempty"`

	// Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
	AdditionalInstructions *string `json:"additional_instructions,omitempty"`

	// Adds additional messages to the thread before creating the run.
	AdditionalMessages *[]CreateMessageRequest `json:"additional_messages,omitempty"`

	// Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
	Tools *[]AssistantObjectToolsInner `json:"tools,omitempty"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata,omitempty"`

	// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
	Temperature *float32 `json:"temperature,omitempty"`

	// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	Stream *bool `json:"stream,omitempty"`

	// The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
	MaxPromptTokens *int32 `json:"max_prompt_tokens,omitempty"`

	// The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
	MaxCompletionTokens *int32 `json:"max_completion_tokens,omitempty"`

	TruncationStrategy TruncationObject `json:"truncation_strategy,omitempty"`

	ToolChoice AssistantsApiToolChoiceOption `json:"tool_choice,omitempty"`

	ResponseFormat AssistantsApiResponseFormatOption `json:"response_format,omitempty"`
}
