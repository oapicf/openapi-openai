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

// RunStreamEventOneOf4 - Occurs when a [run](/docs/api-reference/runs/object) is completed.
type RunStreamEventOneOf4 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
