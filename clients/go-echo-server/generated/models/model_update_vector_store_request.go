package models

type UpdateVectorStoreRequest struct {

	// The name of the vector store.
	Name *string `json:"name,omitempty"`

	ExpiresAfter VectorStoreExpirationAfter `json:"expires_after,omitempty"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata,omitempty"`
}
