package models

// Embedding - Represents an embedding vector returned by embedding endpoint. 
type Embedding struct {

	// The index of the embedding in the list of embeddings.
	Index int32 `json:"index"`

	// The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
	Embedding []float32 `json:"embedding"`

	// The object type, which is always \"embedding\".
	Object string `json:"object"`
}
