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

// ThreadStreamEventOneOf - Occurs when a new [thread](/docs/api-reference/threads/object) is created.
type ThreadStreamEventOneOf struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
