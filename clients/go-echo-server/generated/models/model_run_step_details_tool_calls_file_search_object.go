package models

type RunStepDetailsToolCallsFileSearchObject struct {

	// The ID of the tool call object.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `file_search` for this type of tool call.
	Type string `json:"type"`

	FileSearch RunStepDetailsToolCallsFileSearchObjectFileSearch `json:"file_search"`
}
