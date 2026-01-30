package models

type CreateVectorStoreFileBatchRequest struct {

	// A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
	FileIds []string `json:"file_ids"`

	ChunkingStrategy ChunkingStrategyRequestParam `json:"chunking_strategy,omitempty"`
}
