package models

// CreateChatCompletionResponse - Represents a chat completion response returned by model, based on the provided input.
type CreateChatCompletionResponse struct {

	// A unique identifier for the chat completion.
	Id string `json:"id"`

	// A list of chat completion choices. Can be more than one if `n` is greater than 1.
	Choices []CreateChatCompletionResponseChoicesInner `json:"choices"`

	// The Unix timestamp (in seconds) of when the chat completion was created.
	Created int32 `json:"created"`

	// The model used for the chat completion.
	Model string `json:"model"`

	// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
	ServiceTier *string `json:"service_tier,omitempty"`

	// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	SystemFingerprint string `json:"system_fingerprint,omitempty"`

	// The object type, which is always `chat.completion`.
	Object string `json:"object"`

	Usage CompletionUsage `json:"usage,omitempty"`
}
