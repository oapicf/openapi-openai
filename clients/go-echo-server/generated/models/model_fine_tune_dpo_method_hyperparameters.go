package models

// FineTuneDpoMethodHyperparameters - The hyperparameters used for the fine-tuning job.
type FineTuneDpoMethodHyperparameters struct {

	Beta FineTuneDpoMethodHyperparametersBeta `json:"beta,omitempty"`

	BatchSize FineTuneDpoMethodHyperparametersBatchSize `json:"batch_size,omitempty"`

	LearningRateMultiplier FineTuneDpoMethodHyperparametersLearningRateMultiplier `json:"learning_rate_multiplier,omitempty"`

	NEpochs FineTuneDpoMethodHyperparametersNEpochs `json:"n_epochs,omitempty"`
}
