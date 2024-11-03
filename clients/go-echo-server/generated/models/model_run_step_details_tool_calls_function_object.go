package models

type RunStepDetailsToolCallsFunctionObject struct {

	// The ID of the tool call object.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `function` for this type of tool call.
	Type string `json:"type"`

	Function RunStepDetailsToolCallsFunctionObjectFunction `json:"function"`
}
