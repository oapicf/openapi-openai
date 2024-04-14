package models

type AssistantToolsFunction struct {

	// The type of tool being defined: `function`
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}
