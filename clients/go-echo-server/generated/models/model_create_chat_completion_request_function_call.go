package models

// CreateChatCompletionRequestFunctionCall - Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.
type CreateChatCompletionRequestFunctionCall struct {

	// The name of the function to call.
	Name string `json:"name"`
}
