package models

// FineTuneMethod - The method used for fine-tuning.
type FineTuneMethod struct {

	// The type of method. Is either `supervised` or `dpo`.
	Type string `json:"type,omitempty"`

	Supervised FineTuneSupervisedMethod `json:"supervised,omitempty"`

	Dpo FineTuneDpoMethod `json:"dpo,omitempty"`
}
