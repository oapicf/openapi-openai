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

// MessageStreamEventOneOf4 - Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
type MessageStreamEventOneOf4 struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}