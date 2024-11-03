package models

import (
	"gopkg.in/validator.v2"
)

type RunStepDetailsToolCallsObjectToolCallsInner struct {

	// The ID of the tool call object.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter"`

	// For now, this is always going to be an empty object.
	Retrieval map[string]interface{} `json:"retrieval"`

	Function RunStepDetailsToolCallsFunctionObjectFunction `json:"function"`
}
