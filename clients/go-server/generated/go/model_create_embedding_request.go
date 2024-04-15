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


import (
	"errors"
)



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

// AssertCreateEmbeddingRequestRequired checks if the required fields are not zero-ed
func AssertCreateEmbeddingRequestRequired(obj CreateEmbeddingRequest) error {
	elements := map[string]interface{}{
		"input": obj.Input,
		"model": obj.Model,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCreateEmbeddingRequestInputRequired(obj.Input); err != nil {
		return err
	}
	if err := AssertCreateEmbeddingRequestModelRequired(obj.Model); err != nil {
		return err
	}
	return nil
}

// AssertCreateEmbeddingRequestConstraints checks if the values respects the defined constraints
func AssertCreateEmbeddingRequestConstraints(obj CreateEmbeddingRequest) error {
	if obj.Dimensions < 1 {
		return &ParsingError{Err: errors.New(errMsgMinValueConstraint)}
	}
	return nil
}