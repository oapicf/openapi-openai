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

// RunObjectIncompleteDetails - Details on why the run is incomplete. Will be `null` if the run is not incomplete.
type RunObjectIncompleteDetails struct {

	// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	Reason string `json:"reason,omitempty"`
}
