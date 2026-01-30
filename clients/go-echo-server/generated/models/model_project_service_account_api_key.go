package models

type ProjectServiceAccountApiKey struct {

	// The object type, which is always `organization.project.service_account.api_key`
	Object string `json:"object"`

	Value string `json:"value"`

	Name string `json:"name"`

	CreatedAt int32 `json:"created_at"`

	Id string `json:"id"`
}
