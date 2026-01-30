package models

// FineTuningJobHyperparameters - The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
type FineTuningJobHyperparameters struct {

	BatchSize CreateFineTuningJobRequestHyperparametersBatchSize `json:"batch_size,omitempty"`

	LearningRateMultiplier CreateFineTuningJobRequestHyperparametersLearningRateMultiplier `json:"learning_rate_multiplier,omitempty"`

	NEpochs CreateFineTuningJobRequestHyperparametersNEpochs `json:"n_epochs,omitempty"`
}
