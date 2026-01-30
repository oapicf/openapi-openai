package models

type StaticChunkingStrategyResponseParam struct {

	// Always `static`.
	Type string `json:"type"`

	Static StaticChunkingStrategy `json:"static"`
}
