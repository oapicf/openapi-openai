package models

type ModifyThreadRequestToolResourcesFileSearch struct {

	// The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
	VectorStoreIds []string `json:"vector_store_ids,omitempty"`
}
