package models

// Model - Describes an OpenAI model offering that can be used with the API.
type Model struct {

	// The model identifier, which can be referenced in the API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) when the model was created.
	Created int32 `json:"created"`

	// The object type, which is always \"model\".
	Object string `json:"object"`

	// The organization that owns the model.
	OwnedBy string `json:"owned_by"`
}
