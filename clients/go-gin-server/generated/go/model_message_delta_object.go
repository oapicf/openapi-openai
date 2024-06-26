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

// MessageDeltaObject - Represents a message delta i.e. any changed fields on a message during streaming. 
type MessageDeltaObject struct {

	// The identifier of the message, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.message.delta`.
	Object string `json:"object"`

	Delta MessageDeltaObjectDelta `json:"delta"`
}
