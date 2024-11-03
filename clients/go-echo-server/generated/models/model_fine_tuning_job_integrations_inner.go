package models

import (
	"gopkg.in/validator.v2"
)

type FineTuningJobIntegrationsInner struct {

	// The type of the integration being enabled for the fine-tuning job
	Type string `json:"type"`

	Wandb CreateFineTuningJobRequestIntegrationsInnerWandb `json:"wandb"`
}
