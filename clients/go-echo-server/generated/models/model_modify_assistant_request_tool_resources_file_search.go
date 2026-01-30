package models

type ModifyAssistantRequestToolResourcesFileSearch struct {

	// Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	VectorStoreIds []string `json:"vector_store_ids,omitempty"`
}
