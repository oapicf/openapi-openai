// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"gopkg.in/validator.v2"
)



// CreateCompletionRequestPrompt - The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
type CreateCompletionRequestPrompt struct {
}

// AssertCreateCompletionRequestPromptRequired checks if the required fields are not zero-ed
func AssertCreateCompletionRequestPromptRequired(obj CreateCompletionRequestPrompt) error {
	return nil
}

// AssertCreateCompletionRequestPromptConstraints checks if the values respects the defined constraints
func AssertCreateCompletionRequestPromptConstraints(obj CreateCompletionRequestPrompt) error {
	return nil
}
