package models

// CostsResult - The aggregated costs details of the specific time bucket.
type CostsResult struct {

	Object string `json:"object"`

	Amount CostsResultAmount `json:"amount,omitempty"`

	// When `group_by=line_item`, this field provides the line item of the grouped costs result.
	LineItem *string `json:"line_item,omitempty"`

	// When `group_by=project_id`, this field provides the project ID of the grouped costs result.
	ProjectId *string `json:"project_id,omitempty"`
}
