package models

// AssistantsApiResponseFormat - An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
type AssistantsApiResponseFormat struct {

	// Must be one of `text` or `json_object`.
	Type string `json:"type,omitempty"`
}
