package models

type AdminApiKeyOwner struct {

	Type string `json:"type,omitempty"`

	Id string `json:"id,omitempty"`

	Name string `json:"name,omitempty"`

	CreatedAt int64 `json:"created_at,omitempty"`

	Role string `json:"role,omitempty"`
}
