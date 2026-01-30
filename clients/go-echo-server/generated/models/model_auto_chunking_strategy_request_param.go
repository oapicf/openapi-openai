package models

// AutoChunkingStrategyRequestParam - The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
type AutoChunkingStrategyRequestParam struct {

	// Always `auto`.
	Type string `json:"type"`
}
