package models

// VectorStoreFileBatchObject - A batch of files attached to a vector store.
type VectorStoreFileBatchObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `vector_store.file_batch`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the vector store files batch was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
	VectorStoreId string `json:"vector_store_id"`

	// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
	Status string `json:"status"`

	FileCounts VectorStoreFileBatchObjectFileCounts `json:"file_counts"`
}
