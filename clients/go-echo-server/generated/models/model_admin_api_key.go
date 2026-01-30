package models

type AdminApiKey struct {

	Object string `json:"object,omitempty"`

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	RedactedValue string `json:"redacted_value,omitempty"`

	Value string `json:"value,omitempty"`

	CreatedAt int64 `json:"created_at,omitempty"`

	Owner AdminApiKeyOwner `json:"owner,omitempty"`
}
