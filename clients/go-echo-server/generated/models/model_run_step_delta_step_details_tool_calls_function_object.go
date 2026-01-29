package models

type RunStepDeltaStepDetailsToolCallsFunctionObject struct {

	// The index of the tool call in the tool calls array.
	Index int32 `json:"index"`

	// The ID of the tool call object.
	Id string `json:"id,omitempty"`

	// The type of tool call. This is always going to be `function` for this type of tool call.
	Type string `json:"type"`

	Function RunStepDeltaStepDetailsToolCallsFunctionObjectFunction `json:"function,omitempty"`
}
