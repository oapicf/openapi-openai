package models

type CreateEmbeddingRequest struct {

	Input CreateEmbeddingRequestInput `json:"input"`

	Model CreateEmbeddingRequestModel `json:"model"`

	// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
	EncodingFormat string `json:"encoding_format,omitempty"`

	// The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
	Dimensions int32 `json:"dimensions,omitempty"`

	// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	User string `json:"user,omitempty"`
}
