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

// CreateEmbeddingResponseUsage - The usage information for the request.
type CreateEmbeddingResponseUsage struct {

	// The number of tokens used by the prompt.
	PromptTokens int32 `json:"prompt_tokens"`

	// The total number of tokens used by the request.
	TotalTokens int32 `json:"total_tokens"`
}