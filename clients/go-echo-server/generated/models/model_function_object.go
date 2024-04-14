package models

type FunctionObject struct {

	// A description of what the function does, used by the model to choose when and how to call the function.
	Description string `json:"description,omitempty"`

	// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	Name string `json:"name"`

	// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
	Parameters map[string]interface{} `json:"parameters,omitempty"`
}
