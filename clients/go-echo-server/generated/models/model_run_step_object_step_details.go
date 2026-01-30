package models

// RunStepObjectStepDetails - The details of the run step.
type RunStepObjectStepDetails struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDetailsMessageCreationObjectMessageCreation `json:"message_creation"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	ToolCalls []RunStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls"`
}
