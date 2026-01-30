package models

// CreateVectorStoreRequestChunkingStrategy - The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
type CreateVectorStoreRequestChunkingStrategy struct {

	// Always `auto`.
	Type string `json:"type"`

	Static StaticChunkingStrategy `json:"static"`
}
