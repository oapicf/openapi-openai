package models

type CreateAssistantRequestToolResourcesFileSearch struct {

	// The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	VectorStoreIds []string `json:"vector_store_ids,omitempty"`

	// A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	VectorStores []CreateAssistantRequestToolResourcesFileSearchVectorStoresInner `json:"vector_stores,omitempty"`
}
