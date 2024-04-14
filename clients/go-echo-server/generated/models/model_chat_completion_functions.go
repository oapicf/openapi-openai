package models

type ChatCompletionFunctions struct {

	// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	Name string `json:"name"`

	// The description of what the function does.
	Description string `json:"description,omitempty"`

	// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
	Parameters map[string]interface{} `json:"parameters,omitempty"`
}