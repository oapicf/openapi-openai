package models

type CreateModerationRequest struct {

	Input CreateModerationRequestInput `json:"input"`

	Model CreateModerationRequestModel `json:"model,omitempty"`
}
