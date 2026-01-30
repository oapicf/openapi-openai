package models

// RunStepObject - Represents a step in execution of a run. 
type RunStepObject struct {

	// The identifier of the run step, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.run.step`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the run step was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
	AssistantId string `json:"assistant_id"`

	// The ID of the [thread](/docs/api-reference/threads) that was run.
	ThreadId string `json:"thread_id"`

	// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
	RunId string `json:"run_id"`

	// The type of run step, which can be either `message_creation` or `tool_calls`.
	Type string `json:"type"`

	// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
	Status string `json:"status"`

	StepDetails RunStepObjectStepDetails `json:"step_details"`

	LastError *RunStepObjectLastError `json:"last_error"`

	// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
	ExpiredAt *int32 `json:"expired_at"`

	// The Unix timestamp (in seconds) for when the run step was cancelled.
	CancelledAt *int32 `json:"cancelled_at"`

	// The Unix timestamp (in seconds) for when the run step failed.
	FailedAt *int32 `json:"failed_at"`

	// The Unix timestamp (in seconds) for when the run step completed.
	CompletedAt *int32 `json:"completed_at"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`

	Usage *RunStepCompletionUsage `json:"usage"`
}
