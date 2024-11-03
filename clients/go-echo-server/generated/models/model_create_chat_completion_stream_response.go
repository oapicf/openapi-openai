package models

// CreateChatCompletionStreamResponse - Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
type CreateChatCompletionStreamResponse struct {

	// A unique identifier for the chat completion. Each chunk has the same ID.
	Id string `json:"id"`

	// A list of chat completion choices. Can be more than one if `n` is greater than 1.
	Choices []CreateChatCompletionStreamResponseChoicesInner `json:"choices"`

	// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
	Created int32 `json:"created"`

	// The model to generate the completion.
	Model string `json:"model"`

	// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	SystemFingerprint string `json:"system_fingerprint,omitempty"`

	// The object type, which is always `chat.completion.chunk`.
	Object string `json:"object"`
}
