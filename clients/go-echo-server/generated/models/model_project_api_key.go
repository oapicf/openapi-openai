package models

// ProjectApiKey - Represents an individual API key in a project.
type ProjectApiKey struct {

	// The object type, which is always `organization.project.api_key`
	Object string `json:"object"`

	// The redacted value of the API key
	RedactedValue string `json:"redacted_value"`

	// The name of the API key
	Name string `json:"name"`

	// The Unix timestamp (in seconds) of when the API key was created
	CreatedAt int32 `json:"created_at"`

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	Owner ProjectApiKeyOwner `json:"owner"`
}
