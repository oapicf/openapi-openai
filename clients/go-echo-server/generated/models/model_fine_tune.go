package models

type FineTune struct {

	Id string `json:"id"`

	Object string `json:"object"`

	CreatedAt int32 `json:"created_at"`

	UpdatedAt int32 `json:"updated_at"`

	Model string `json:"model"`

	FineTunedModel *string `json:"fine_tuned_model"`

	OrganizationId string `json:"organization_id"`

	Status string `json:"status"`

	Hyperparams map[string]interface{} `json:"hyperparams"`

	TrainingFiles []OpenAiFile `json:"training_files"`

	ValidationFiles []OpenAiFile `json:"validation_files"`

	ResultFiles []OpenAiFile `json:"result_files"`

	Events []FineTuneEvent `json:"events,omitempty"`
}
