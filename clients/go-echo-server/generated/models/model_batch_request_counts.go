package models

// BatchRequestCounts - The request counts for different statuses within the batch.
type BatchRequestCounts struct {

	// Total number of requests in the batch.
	Total int32 `json:"total"`

	// Number of requests that have been completed successfully.
	Completed int32 `json:"completed"`

	// Number of requests that have failed.
	Failed int32 `json:"failed"`
}
