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




type CreateEmbeddingResponse struct {

	// The list of embeddings generated by the model.
	Data []Embedding `json:"data"`

	// The name of the model used to generate the embedding.
	Model string `json:"model"`

	// The object type, which is always \"list\".
	Object string `json:"object"`

	Usage CreateEmbeddingResponseUsage `json:"usage"`
}

// AssertCreateEmbeddingResponseRequired checks if the required fields are not zero-ed
func AssertCreateEmbeddingResponseRequired(obj CreateEmbeddingResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"model": obj.Model,
		"object": obj.Object,
		"usage": obj.Usage,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertEmbeddingRequired(el); err != nil {
			return err
		}
	}
	if err := AssertCreateEmbeddingResponseUsageRequired(obj.Usage); err != nil {
		return err
	}
	return nil
}

// AssertCreateEmbeddingResponseConstraints checks if the values respects the defined constraints
func AssertCreateEmbeddingResponseConstraints(obj CreateEmbeddingResponse) error {
	return nil
}