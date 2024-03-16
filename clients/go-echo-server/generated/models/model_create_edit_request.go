package models

type CreateEditRequest struct {

	Model CreateEditRequestModel `json:"model"`

	// The input text to use as a starting point for the edit.
	Input *string `json:"input,omitempty"`

	// The instruction that tells the model how to edit the prompt.
	Instruction string `json:"instruction"`

	// How many edits to generate for the input and instruction.
	N *int32 `json:"n,omitempty"`

	// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	Temperature *float32 `json:"temperature,omitempty"`

	// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	TopP *float32 `json:"top_p,omitempty"`
}
