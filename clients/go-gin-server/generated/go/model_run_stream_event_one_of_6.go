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

// RunStreamEventOneOf6 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
type RunStreamEventOneOf6 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
