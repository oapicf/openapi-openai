package models

// RunToolCallObjectFunction - The function definition.
type RunToolCallObjectFunction struct {

	// The name of the function.
	Name string `json:"name"`

	// The arguments that the model expects you to pass to the function.
	Arguments string `json:"arguments"`
}
