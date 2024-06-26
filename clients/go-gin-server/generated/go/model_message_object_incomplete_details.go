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

// MessageObjectIncompleteDetails - On an incomplete message, details about why the message is incomplete.
type MessageObjectIncompleteDetails struct {

	// The reason the message is incomplete.
	Reason string `json:"reason"`
}
