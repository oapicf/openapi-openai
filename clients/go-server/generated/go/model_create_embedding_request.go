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




type CreateEmbeddingRequest struct {

	Model CreateEmbeddingRequestModel `json:"model"`

	Input CreateEmbeddingRequestInput `json:"input"`

	// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	User string `json:"user,omitempty"`
}

// AssertCreateEmbeddingRequestRequired checks if the required fields are not zero-ed
func AssertCreateEmbeddingRequestRequired(obj CreateEmbeddingRequest) error {
	elements := map[string]interface{}{
		"model": obj.Model,
		"input": obj.Input,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCreateEmbeddingRequestModelRequired(obj.Model); err != nil {
		return err
	}
	if err := AssertCreateEmbeddingRequestInputRequired(obj.Input); err != nil {
		return err
	}
	return nil
}

// AssertCreateEmbeddingRequestConstraints checks if the values respects the defined constraints
func AssertCreateEmbeddingRequestConstraints(obj CreateEmbeddingRequest) error {
	return nil
}
