package models

type CreateThreadRequestToolResourcesFileSearchVectorStoresInner struct {

	// A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
	FileIds []string `json:"file_ids,omitempty"`

	ChunkingStrategy CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy `json:"chunking_strategy,omitempty"`

	// Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	Metadata map[string]interface{} `json:"metadata,omitempty"`
}
