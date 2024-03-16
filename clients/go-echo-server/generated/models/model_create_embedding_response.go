package models

type CreateEmbeddingResponse struct {

	Object string `json:"object"`

	Model string `json:"model"`

	Data []CreateEmbeddingResponseDataInner `json:"data"`

	Usage CreateEmbeddingResponseUsage `json:"usage"`
}
