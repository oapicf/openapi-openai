package models

// RunStepDeltaObjectDeltaStepDetails - The details of the run step.
type RunStepDeltaObjectDeltaStepDetails struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDeltaStepDetailsMessageCreationObjectMessageCreation `json:"message_creation,omitempty"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	ToolCalls []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls,omitempty"`
}
