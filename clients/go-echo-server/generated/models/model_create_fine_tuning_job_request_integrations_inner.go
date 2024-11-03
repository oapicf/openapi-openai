package models

type CreateFineTuningJobRequestIntegrationsInner struct {

	Type CreateFineTuningJobRequestIntegrationsInnerType `json:"type"`

	Wandb CreateFineTuningJobRequestIntegrationsInnerWandb `json:"wandb"`
}
