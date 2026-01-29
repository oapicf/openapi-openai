package models

type CreateFineTuningJobRequestIntegrationsInner struct {

	Type string `json:"type"`

	Wandb CreateFineTuningJobRequestIntegrationsInnerWandb `json:"wandb"`
}
