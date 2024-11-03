package models

// ChatCompletionFunctionCallOption - Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
type ChatCompletionFunctionCallOption struct {

	// The name of the function to call.
	Name string `json:"name"`
}
