package models

// FineTuneDpoMethod - Configuration for the DPO fine-tuning method.
type FineTuneDpoMethod struct {

	Hyperparameters FineTuneDpoMethodHyperparameters `json:"hyperparameters,omitempty"`
}
