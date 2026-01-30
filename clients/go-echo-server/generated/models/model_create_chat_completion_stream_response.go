package models

// CreateChatCompletionStreamResponse - Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
type CreateChatCompletionStreamResponse struct {

	// A unique identifier for the chat completion. Each chunk has the same ID.
	Id string `json:"id"`

	// A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
	Choices []CreateChatCompletionStreamResponseChoicesInner `json:"choices"`

	// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
	Created int32 `json:"created"`

	// The model to generate the completion.
	Model string `json:"model"`

	// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
	ServiceTier *string `json:"service_tier,omitempty"`

	// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	SystemFingerprint string `json:"system_fingerprint,omitempty"`

	// The object type, which is always `chat.completion.chunk`.
	Object string `json:"object"`

	Usage *CreateChatCompletionStreamResponseUsage `json:"usage,omitempty"`
}
