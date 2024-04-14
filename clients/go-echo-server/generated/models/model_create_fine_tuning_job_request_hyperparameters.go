package models

// CreateFineTuningJobRequestHyperparameters - The hyperparameters used for the fine-tuning job.
type CreateFineTuningJobRequestHyperparameters struct {

	BatchSize CreateFineTuningJobRequestHyperparametersBatchSize `json:"batch_size,omitempty"`

	LearningRateMultiplier CreateFineTuningJobRequestHyperparametersLearningRateMultiplier `json:"learning_rate_multiplier,omitempty"`

	NEpochs CreateFineTuningJobRequestHyperparametersNEpochs `json:"n_epochs,omitempty"`
}
