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

// CreateModerationResponse - Represents if a given text input is potentially harmful.
type CreateModerationResponse struct {

	// The unique identifier for the moderation request.
	Id string `json:"id"`

	// The model used to generate the moderation results.
	Model string `json:"model"`

	// A list of moderation objects.
	Results []CreateModerationResponseResultsInner `json:"results"`
}