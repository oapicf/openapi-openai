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

// AssertCreateEmbeddingResponseUsageRequired checks if the required fields are not zero-ed
func AssertCreateEmbeddingResponseUsageRequired(obj CreateEmbeddingResponseUsage) error {
	elements := map[string]interface{}{
		"prompt_tokens": obj.PromptTokens,
		"total_tokens": obj.TotalTokens,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateEmbeddingResponseUsageConstraints checks if the values respects the defined constraints
func AssertCreateEmbeddingResponseUsageConstraints(obj CreateEmbeddingResponseUsage) error {
	return nil
}