/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// CreateCompletionResponse - Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
type CreateCompletionResponse struct {

	// A unique identifier for the completion.
	Id string `json:"id"`

	// The list of completion choices the model generated for the input prompt.
	Choices []CreateCompletionResponseChoicesInner `json:"choices"`

	// The Unix timestamp (in seconds) of when the completion was created.
	Created int32 `json:"created"`

	// The model used for completion.
	Model string `json:"model"`

	// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	SystemFingerprint string `json:"system_fingerprint,omitempty"`

	// The object type, which is always \"text_completion\"
	Object string `json:"object"`

	Usage CompletionUsage `json:"usage,omitempty"`
}
