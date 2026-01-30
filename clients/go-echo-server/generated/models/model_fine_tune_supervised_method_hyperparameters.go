package models

// FineTuneSupervisedMethodHyperparameters - The hyperparameters used for the fine-tuning job.
type FineTuneSupervisedMethodHyperparameters struct {

	BatchSize FineTuneDpoMethodHyperparametersBatchSize `json:"batch_size,omitempty"`

	LearningRateMultiplier FineTuneDpoMethodHyperparametersLearningRateMultiplier `json:"learning_rate_multiplier,omitempty"`

	NEpochs FineTuneDpoMethodHyperparametersNEpochs `json:"n_epochs,omitempty"`
}
