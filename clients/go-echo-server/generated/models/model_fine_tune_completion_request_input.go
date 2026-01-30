package models

// FineTuneCompletionRequestInput - The per-line training example of a fine-tuning input file for completions models
type FineTuneCompletionRequestInput struct {

	// The input prompt for this training example.
	Prompt string `json:"prompt,omitempty"`

	// The desired completion for this training example.
	Completion string `json:"completion,omitempty"`
}
