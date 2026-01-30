package models

// ChunkingStrategyRequestParam - The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
type ChunkingStrategyRequestParam struct {

	// Always `auto`.
	Type string `json:"type"`

	Static StaticChunkingStrategy `json:"static"`
}
