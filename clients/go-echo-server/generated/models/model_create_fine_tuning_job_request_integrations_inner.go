package models

type CreateFineTuningJobRequestIntegrationsInner struct {

	// The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
	Type string `json:"type"`

	Wandb CreateFineTuningJobRequestIntegrationsInnerWandb `json:"wandb"`
}
