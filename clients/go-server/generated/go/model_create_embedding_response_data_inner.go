/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreateEmbeddingResponseDataInner struct {

	Index int32 `json:"index"`

	Object string `json:"object"`

	Embedding []float32 `json:"embedding"`
}

// AssertCreateEmbeddingResponseDataInnerRequired checks if the required fields are not zero-ed
func AssertCreateEmbeddingResponseDataInnerRequired(obj CreateEmbeddingResponseDataInner) error {
	elements := map[string]interface{}{
		"index": obj.Index,
		"object": obj.Object,
		"embedding": obj.Embedding,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateEmbeddingResponseDataInnerConstraints checks if the values respects the defined constraints
func AssertCreateEmbeddingResponseDataInnerConstraints(obj CreateEmbeddingResponseDataInner) error {
	return nil
}
