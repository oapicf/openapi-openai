package models

type StaticChunkingStrategyRequestParam struct {

	// Always `static`.
	Type string `json:"type"`

	Static StaticChunkingStrategy `json:"static"`
}
