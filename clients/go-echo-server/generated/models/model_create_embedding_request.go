package models

type CreateEmbeddingRequest struct {

	Model CreateEmbeddingRequestModel `json:"model"`

	Input CreateEmbeddingRequestInput `json:"input"`

	// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	User string `json:"user,omitempty"`
}
