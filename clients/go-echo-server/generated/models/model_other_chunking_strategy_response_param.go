package models

// OtherChunkingStrategyResponseParam - This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
type OtherChunkingStrategyResponseParam struct {

	// Always `other`.
	Type string `json:"type"`
}
