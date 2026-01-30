package models

// CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy - The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
type CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy struct {

	// Always `auto`.
	Type string `json:"type"`

	Static StaticChunkingStrategyStatic `json:"static"`
}
