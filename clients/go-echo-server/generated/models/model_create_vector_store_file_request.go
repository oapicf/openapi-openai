package models

type CreateVectorStoreFileRequest struct {

	// A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
	FileId string `json:"file_id"`

	ChunkingStrategy ChunkingStrategyRequestParam `json:"chunking_strategy,omitempty"`
}
