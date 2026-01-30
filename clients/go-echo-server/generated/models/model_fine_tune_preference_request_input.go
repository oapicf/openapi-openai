package models

// FineTunePreferenceRequestInput - The per-line training example of a fine-tuning input file for chat models using the dpo method.
type FineTunePreferenceRequestInput struct {

	Input FineTunePreferenceRequestInputInput `json:"input,omitempty"`

	// The preferred completion message for the output.
	PreferredCompletion []FineTunePreferenceRequestInputPreferredCompletionInner `json:"preferred_completion,omitempty"`

	// The non-preferred completion message for the output.
	NonPreferredCompletion []FineTunePreferenceRequestInputPreferredCompletionInner `json:"non_preferred_completion,omitempty"`
}
