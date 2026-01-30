package models

// VectorStoreFileObjectChunkingStrategy - The strategy used to chunk the file.
type VectorStoreFileObjectChunkingStrategy struct {

	// Always `static`.
	Type string `json:"type"`

	Static StaticChunkingStrategy `json:"static"`
}
