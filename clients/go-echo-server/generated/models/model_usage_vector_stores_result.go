package models

// UsageVectorStoresResult - The aggregated vector stores usage details of the specific time bucket.
type UsageVectorStoresResult struct {

	Object string `json:"object"`

	// The vector stores usage in bytes.
	UsageBytes int32 `json:"usage_bytes"`

	// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	ProjectId *string `json:"project_id,omitempty"`
}
