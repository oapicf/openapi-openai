package models

type AssistantObjectToolsInner struct {

	// The type of tool being defined: `code_interpreter`
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}
