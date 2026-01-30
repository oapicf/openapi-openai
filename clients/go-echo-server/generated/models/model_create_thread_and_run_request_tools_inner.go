package models

type CreateThreadAndRunRequestToolsInner struct {

	// The type of tool being defined: `code_interpreter`
	Type string `json:"type"`

	FileSearch AssistantToolsFileSearchFileSearch `json:"file_search,omitempty"`

	Function FunctionObject `json:"function"`
}
