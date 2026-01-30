package models

type RunStepDeltaStepDetailsToolCallsObjectToolCallsInner struct {

	// The index of the tool call in the tool calls array.
	Index int32 `json:"index"`

	// The ID of the tool call object.
	Id string `json:"id,omitempty"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter,omitempty"`

	// For now, this is always going to be an empty object.
	FileSearch map[string]interface{} `json:"file_search"`

	Function RunStepDeltaStepDetailsToolCallsFunctionObjectFunction `json:"function,omitempty"`
}
