package models

type StaticChunkingStrategy struct {

	// Always `static`.
	Type string `json:"type"`

	Static StaticChunkingStrategyStatic `json:"static"`
}
