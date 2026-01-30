package models

type RunStepDetailsToolCallsObjectToolCallsInner struct {

	// The ID of the tool call object.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter"`

	FileSearch RunStepDetailsToolCallsFileSearchObjectFileSearch `json:"file_search"`

	Function RunStepDetailsToolCallsFunctionObjectFunction `json:"function"`
}
