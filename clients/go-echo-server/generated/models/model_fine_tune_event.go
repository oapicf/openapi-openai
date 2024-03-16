package models

type FineTuneEvent struct {

	Object string `json:"object"`

	CreatedAt int32 `json:"created_at"`

	Level string `json:"level"`

	Message string `json:"message"`
}
