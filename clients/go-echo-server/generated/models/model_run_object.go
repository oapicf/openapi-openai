package models

// RunObject - Represents an execution run on a [thread](/docs/api-reference/threads).
type RunObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.run`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the run was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
	ThreadId string `json:"thread_id"`

	// The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
	AssistantId string `json:"assistant_id"`

	// The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
	Status string `json:"status"`

	RequiredAction *RunObjectRequiredAction `json:"required_action"`

	LastError *RunObjectLastError `json:"last_error"`

	// The Unix timestamp (in seconds) for when the run will expire.
	ExpiresAt *int32 `json:"expires_at"`

	// The Unix timestamp (in seconds) for when the run was started.
	StartedAt *int32 `json:"started_at"`

	// The Unix timestamp (in seconds) for when the run was cancelled.
	CancelledAt *int32 `json:"cancelled_at"`

	// The Unix timestamp (in seconds) for when the run failed.
	FailedAt *int32 `json:"failed_at"`

	// The Unix timestamp (in seconds) for when the run was completed.
	CompletedAt *int32 `json:"completed_at"`

	IncompleteDetails *RunObjectIncompleteDetails `json:"incomplete_details"`

	// The model that the [assistant](/docs/api-reference/assistants) used for this run.
	Model string `json:"model"`

	// The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
	Instructions string `json:"instructions"`

	// The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
	Tools []AssistantObjectToolsInner `json:"tools"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`

	Usage *RunCompletionUsage `json:"usage"`

	// The sampling temperature used for this run. If not set, defaults to 1.
	Temperature *float32 `json:"temperature,omitempty"`

	// The nucleus sampling value used for this run. If not set, defaults to 1.
	TopP *float32 `json:"top_p,omitempty"`

	// The maximum number of prompt tokens specified to have been used over the course of the run. 
	MaxPromptTokens *int32 `json:"max_prompt_tokens"`

	// The maximum number of completion tokens specified to have been used over the course of the run. 
	MaxCompletionTokens *int32 `json:"max_completion_tokens"`

	TruncationStrategy TruncationObject `json:"truncation_strategy"`

	ToolChoice AssistantsApiToolChoiceOption `json:"tool_choice"`

	// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	ParallelToolCalls bool `json:"parallel_tool_calls"`

	ResponseFormat AssistantsApiResponseFormatOption `json:"response_format"`
}
