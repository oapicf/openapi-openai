package models

// FineTuningJobHyperparameters - The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
type FineTuningJobHyperparameters struct {

	NEpochs FineTuningJobHyperparametersNEpochs `json:"n_epochs"`
}
