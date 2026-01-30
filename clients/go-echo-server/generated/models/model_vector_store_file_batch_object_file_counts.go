package models

type VectorStoreFileBatchObjectFileCounts struct {

	// The number of files that are currently being processed.
	InProgress int32 `json:"in_progress"`

	// The number of files that have been processed.
	Completed int32 `json:"completed"`

	// The number of files that have failed to process.
	Failed int32 `json:"failed"`

	// The number of files that where cancelled.
	Cancelled int32 `json:"cancelled"`

	// The total number of files.
	Total int32 `json:"total"`
}
