package models

type CreateThreadRequestToolResourcesFileSearch struct {

	// The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
	VectorStoreIds []string `json:"vector_store_ids,omitempty"`

	// A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
	VectorStores []CreateThreadRequestToolResourcesFileSearchVectorStoresInner `json:"vector_stores,omitempty"`
}
