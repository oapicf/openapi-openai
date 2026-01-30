package models

// FineTuneSupervisedMethod - Configuration for the supervised fine-tuning method.
type FineTuneSupervisedMethod struct {

	Hyperparameters FineTuneSupervisedMethodHyperparameters `json:"hyperparameters,omitempty"`
}
