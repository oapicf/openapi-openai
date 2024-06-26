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

// MessageContentTextObject - The text content that is part of a message.
type MessageContentTextObject struct {

	// Always `text`.
	Type string `json:"type"`

	Text MessageContentTextObjectText `json:"text"`
}
