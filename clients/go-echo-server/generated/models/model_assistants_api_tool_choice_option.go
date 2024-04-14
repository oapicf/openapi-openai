package models

// AssistantsApiToolChoiceOption - Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
type AssistantsApiToolChoiceOption struct {

	// The type of the tool. If type is `function`, the function name must be set
	Type string `json:"type"`

	Function ChatCompletionNamedToolChoiceFunction `json:"function,omitempty"`
}
