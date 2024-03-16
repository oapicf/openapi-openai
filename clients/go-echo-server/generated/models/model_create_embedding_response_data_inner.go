package models

type CreateEmbeddingResponseDataInner struct {

	Index int32 `json:"index"`

	Object string `json:"object"`

	Embedding []float32 `json:"embedding"`
}
